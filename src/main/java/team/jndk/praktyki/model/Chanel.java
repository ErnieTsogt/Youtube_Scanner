package team.jndk.praktyki.model;


import java.util.ArrayList;
import java.util.List;

public class Chanel {
    private String id;
    private String name;
    private List<Video> videos = new ArrayList<>();

    public void addVideo(Video video) {
        videos.add(video);
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Video> getVideos(List<Video> videos) {
        return videos;
    }
}


