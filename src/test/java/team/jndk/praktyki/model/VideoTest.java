package team.jndk.praktyki.model;

import org.junit.Ignore;
import org.junit.Test;
import team.jndk.praktyki.model.data.Video;
import team.jndk.praktyki.model.exception.NullParamException;

import static junit.framework.TestCase.assertEquals;

public class VideoTest {

    @Test

    public void testGettingAndSettingTitle() {
        String title = "title";
        Video video = new Video(title, "Lekcja1", 20000, 20, 10, "10.02.2019");
        assertEquals(title, video.getTitle());
    }

    @Test(expected = NullParamException.class)
    @Ignore
    public void testTitleValues() {
        String title = null;
        Video video = new Video(title, "Lekcja1", 20000, 20, 10, "10.02.2019");
    }

    @Test

    public void testIdValues() {
        String value = "";
        Video video = new Video("JavaTutorial", value, 20000, 20, 10, "10.02.2019");
    }


    @Test(expected = IllegalArgumentException.class)
    @Ignore
    public void testViewsValueNegative() {
        int value = -8;
        new Video("JavaTutorial", "Lekcja1", value, 20, 10, "10.02.2019");
    }

    @Test

    public void testViewsValueZero() {
        int value = 0;
        Video video = new Video("JavaTutorial", "Lekcja1", value, 20, 10, "10.02.2019");
        assertEquals(value, video.getViews());
    }

    @Test

    public void testViewsValuePositive() {
        int value = 13;
        Video video = new Video("JavaTutorial", "Lekcja1", value, 20, 10, "10.02.2019");
        assertEquals(value, video.getViews());
    }

    @Test(expected = IllegalArgumentException.class)
    @Ignore
    public void testLikesValueNegative() {
        int value = -8;
        Video video = new Video("JavaTutorial", "Lekcja1", 20000, value, 10, "10.02.2019");
    }

    @Test
    public void testLikesValueZero() {
        int value = 0;
        Video video = new Video("JavaTutorial", "Lekcja1", 20000, value ,10, "10.02.2019");
        assertEquals(value, video.getLikes());
    }

    @Test

    public void testLikesValuePositive() {
        int value = 13;
        Video video = new Video("JavaTutorial", "Lekcja1", 20000, value, 10, "10.02.2019");
        assertEquals(value, video.getLikes());
    }

    @Test(expected = IllegalArgumentException.class)
    @Ignore
    public void testCommentsValueNegative() {
        int value = -8;
        Video video = new Video("JavaTutorial", "Lekcja1", 20000, 20, value, "10.02.2019");
    }

    @Test

    public void testCommentsValueZero() {
        int value = 0;
        Video video = new Video("JavaTutorial", "Lekcja1", 20000, 20, value, "10.02.2019");
        assertEquals(value, video.getComments());
    }

    @Test

    public void testCommentsValuePositive() {
        int value = 13;
        Video video = new Video("JavaTutorial", "Lekcja1", 20000, 20, value, "10.02.2019");
        assertEquals(value, video.getComments());
    }

    @Test(expected = NullParamException.class)
    @Ignore
    public void testScannedDataValues() {
        String value = "";
        Video video = new Video("JavaTutorial", "Lekcja1", 20000, 20, 10, value);
    }
}