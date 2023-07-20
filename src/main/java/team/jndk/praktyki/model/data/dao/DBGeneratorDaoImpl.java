package team.jndk.praktyki.model.data.dao;

import team.jndk.praktyki.model.data.Channel;
import team.jndk.praktyki.model.data.Video;

import java.sql.*;
import java.util.List;
import java.util.Set;

public class DBGeneratorDaoImpl implements DataGeneratorDao {
    private static String database_url;

    public DBGeneratorDaoImpl(String url) {
        database_url = url;
    }

    @Override
    public void saveChannels(List<Channel> channels) {

        try (Connection conn = DriverManager.getConnection(database_url);
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT OR REPLACE INTO Channels (ChannelNames, GoogleChanID) VALUES (?, ?)",
                     Statement.RETURN_GENERATED_KEYS
             )) {


            for (Channel channel : channels) {

                stmt.setString(1, channel.getGoogleId());

                int affectedRows = stmt.executeUpdate();

                if (affectedRows == 0) {
                    throw new SQLException("Creating channel failed, no rows affected.");
                }
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        channel.setId(generatedKeys.getInt(1));
                    }
                    else {
                        throw new SQLException("Creating channel failed, no ID obtained.");
                    }
                }
            }

            System.out.println("Channels successfully saved to the database.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveVideos(List<Channel> channels) {

        try (Connection conn = DriverManager.getConnection(database_url);
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO Videos (title, GoogleVidID, views, likes, comments, scannedDate) VALUES (?, ?, ?, ?, ?, ?)"
             )) {

            // Insert video data into the database
            for (Channel channel : channels) {
                Set<Video> videos = channel.getVideos();
                for (Video video : videos) {
                    stmt.setString(1, video.getTitle());
                    stmt.setString(2, video.getGoogleId());
                    stmt.setInt(3, video.getViews());
                    stmt.setInt(4, video.getLikes());
                    stmt.setInt(5, video.getComments());
                    stmt.setLong(6, video.getScannedDate());
                    stmt.executeUpdate();
                }
            }

            System.out.println("Videos successfully saved to the database.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
