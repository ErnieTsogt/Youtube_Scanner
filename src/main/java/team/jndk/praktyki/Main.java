package team.jndk.praktyki;

import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotBlank;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Slf4j
public class Main {
    public static void main(@NotBlank String[] args) {
        String propsFile = args[0];
        Properties props = new Properties();

        try (FileInputStream input = new FileInputStream(propsFile)) {
            props.load(input);
        } catch (IOException e) {
            log.error("Failed to load properties file: " + e.getMessage());
            return;
        }

        String channelId = props.getProperty("channel_id");
        log.info("Channel ID: " + channelId);
    }


}
