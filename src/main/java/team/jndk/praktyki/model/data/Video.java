package team.jndk.praktyki.model.data;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Video {
    @NotBlank
    private final String title;
    private final String id;
    private final int views;
    private final int likes;
    private final int comments;
    private final String scannedDate;

}
