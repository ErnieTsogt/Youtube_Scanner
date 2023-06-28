package team.jndk.praktyki.model.data;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Data
public class Channel {
    @NotBlank
    private final String id;
    private final Set<Video> videos = new HashSet<>();

    public void addVideos(Video... videos) {
        this.videos.addAll(Arrays.asList(videos));
    }

    @Override
    public String toString() {
        return "Channel{" +
                "id='" + id + "'\n" +
                ", videos=\n" + videos +
                '}';
    }
}

