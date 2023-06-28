package team.jndk.praktyki.model.data;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Data
public class Channel {
    @NotBlank
    private final String id;
    private final Set<Video> videos = new HashSet<>();

    public void addVideo(Video video) {
        videos.add(video);
    }
}

