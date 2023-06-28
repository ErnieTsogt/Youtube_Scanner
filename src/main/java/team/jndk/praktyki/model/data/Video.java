package team.jndk.praktyki.model.data;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.*;
import java.util.Date;

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
    private final long scannedDate;

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + "'\n" +
                ", id='" + id + "'\n" +
                ", views=" + views + "'\n" +
                ", likes=" + likes + "'\n" +
                ", comments=" + comments + "'\n" +
                ", scannedDate='" + scannedDate +
                "}\n\n";
    }
}
