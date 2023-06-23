package team.jndk.praktyki.model;

import org.junit.Test;
import team.jndk.praktyki.model.data.Channel;
import team.jndk.praktyki.model.data.Video;

import static junit.framework.TestCase.assertEquals;

public class ChannelTest {

    @Test
    public void testIdenticalEntries() {
        Channel addVid = new Channel();
        Video video = new Video("JavaTutorial", "Lekcja1", 20000, 20,10,"10.02.2019");
        addVid.addVideo(video);
        addVid.addVideo(new Video("JavaTutorial", "pies", 20000, 20,10,"10.02.2019"));
        addVid.addVideo(new Video("JavaTutorial", "pies", 20000, 20,10,"10.02.2019"));

        assertEquals(2, addVid.getVideos().size());
    }
}
