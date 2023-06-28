package team.jndk.praktyki.model.data;

import java.util.*;

public class DataGenerator {
    public static void main(String[] args) {

        int numChannels = 2;

        Channel channel = new Channel("id");
//        channel.addVideos(new Video("title", "id", 1, 1, 1, 1234l), new Video("title2", "id2", 2, 2, 2, 2345l));
        List<Channel> channels = generateChannels(numChannels);
        populateVideos(channels);

        System.out.println(channels);
        System.exit(0);

    }

    public static List<Channel> generateChannels(int numChannels) {
        List<Channel> channels = new ArrayList<>();

        for (int i = 1; i <= numChannels; i++) {
            String channelId = "Channel " + i;
            Channel channel = new Channel(channelId);
            channels.add(channel);
        }

        return channels;
    }

    public static void populateVideos(List<Channel> channels) {
        Random random = new Random();

        for (Channel channel : channels) {
            int numVideos = 5;
            int i;
            String id1 = UUID.randomUUID().toString();
            String id2 = UUID.randomUUID().toString();
            String videoTitle="";
            for (i = 1; i <= numVideos; i++) {
                int randomNumber = random.nextInt(2);
                String id;
                if (channel.getId().equals("Channel 1")) {
                    if (i <= 3) {
                        videoTitle = "Tech";
                    } else {
                        videoTitle = "Kod";
                    }
                } else if (channel.getId().equals("Channel 2")) {
                    if (i <= 3) {
                        videoTitle = "Java";
                    } else {
                        videoTitle = "Scala";
                    }
                }

                if (randomNumber == 0) {
                    id = id1; // Pierwszy kod UUID
                } else {
                    id = id2; // Drugi kod UUID
                }

                int views = random.nextInt(1000000) + 1000; // Random number of views
                int likes = random.nextInt(5000) + 100; // Random number of likes
                int comments = random.nextInt(500) + 50; // Random number of comments
                long scannedDate = random.nextLong(10000000000000l); // Random scanned date
                Date date =new Date(scannedDate);
                Video video = new Video(videoTitle, id, views, likes, comments, date.toInstant().toEpochMilli());
                channel.addVideos(video);
                channel.getVideos().;
            }
        }
    }





}
