package team.jndk.praktyki.model.data;

import java.util.*;

public class DataGenerator {
    public static void main(String[] args) {

        int numChannels = 2;

        Channel channel = new Channel("id");
        channel.addVideos(new Video("title", "id", 1, 1, 1, "1234"), new Video("title2", "id2", 2, 2, 2, "2345"));
        System.out.println(channel);
        System.exit(0);
//        List<Channel> channels = generateChannels(numChannels);
//        populateVideos(channels);

//        for (Channel channel : channels) {
//            printChannel(channel);
//        }


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
                if (channel.getId().equals("channel 1")) {
                    if (i <= 3) {
                        videoTitle = "Tech";
                    } else {
                        videoTitle = "Kod";
                    }
                } else if (channel.getId().equals("channel 2")) {
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
                String scannedDate = generateRandomDate(); // Random scanned date

                Video video = new Video(videoTitle, id, views, likes, comments, scannedDate);
                channel.addVideos(video);
            }
        }
    }

    public static String generateRandomDate() {
        Random random = new Random();
        int year = random.nextInt(3) + 2020; // Random year between 2020 and 2022
        int month = random.nextInt(12) + 1; // Random month between 1 and 12
        int day = random.nextInt(28) + 1; // Random day between 1 and 28

        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public static void printChannel(Channel channel) {
        System.out.println("Channel: " + channel.getId());

        Set<Video> videos = channel.getVideos();
        for (Video video : videos) {
            System.out.println("Title: " + video.getTitle());
            System.out.println("ID: " + video.getId());
            System.out.println("Views: " + video.getViews());
            System.out.println("Likes: " + video.getLikes());
            System.out.println("Comments: " + video.getComments());
            System.out.println("Scanned Date: " + video.getScannedDate());
            System.out.println();
        }

        System.out.println();
    }

}
