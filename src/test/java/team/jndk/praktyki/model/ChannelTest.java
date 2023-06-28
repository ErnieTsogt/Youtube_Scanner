package team.jndk.praktyki.model;

import org.junit.Test;
import team.jndk.praktyki.model.data.Channel;
import team.jndk.praktyki.model.data.Video;

import static junit.framework.TestCase.assertEquals;

public class ChannelTest {

    @Test
    public void testIdenticalEntries() {
        Channel addVid = new Channel("id");
        Video video = new Video("JavaTutorial", "kot", 20000, 20,10,"10.02.2019");
        addVid.addVideos(video);
        addVid.addVideos(new Video("JavaTutorial", "pies", 20000, 20,10,"10.02.2019"));
        addVid.addVideos(new Video("JavaTutorial", "pies", 20000, 20,10,"10.02.2019"));

        assertEquals(2, addVid.getVideos().size());
    }
}
