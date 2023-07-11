package team.jndk.praktyki.model.data;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@RequiredArgsConstructor
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

    private Video() {
        title = "";
        id = "";
        views = Integer.MIN_VALUE;
        likes = Integer.MIN_VALUE;
        comments = Integer.MIN_VALUE;
        scannedDate = Long.MIN_VALUE;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + "'\n" +
                ", id='" + id + "'\n" +
                ", views=" + views + "'\n" +
                ", likes=" + likes + "'\n" +
                ", comments=" + comments + "'\n" +
                ", scannedDate='" + new Date(scannedDate).toGMTString() +
                "}\n\n";
    }
}
