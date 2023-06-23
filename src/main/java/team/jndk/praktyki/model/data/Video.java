package team.jndk.praktyki.model.data;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.*;

@Data
public class Video {
    @NotBlank
    private final String title;
    @NotBlank
    private final String id;
    @Min(0)
    private final int views;
    @Min(0)
    private final int likes;
    @Min(0)
    private final int comments;
    @NotBlank
    private final String scannedDate;

}
