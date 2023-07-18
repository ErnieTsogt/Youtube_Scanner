package team.jndk.praktyki;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import team.jndk.praktyki.model.data.Channel;
import team.jndk.praktyki.model.data.DataGenerator;
import team.jndk.praktyki.model.data.dao.DataGeneratorDao;
import team.jndk.praktyki.model.data.dao.DataGeneratorDaoImpl;

import javax.validation.constraints.NotBlank;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

@Slf4j
public class Main {


    private static ObjectMapper objectMapper = new ObjectMapper();


    public static void main(@NotBlank String[] args) {
        String propsFile = args[0];
        Properties prop = new Properties();
        try (FileInputStream input = new FileInputStream(propsFile)) {
            prop.load(input);
        } catch (IOException e) {
            log.error("Failed to load properties file: " + e.getMessage());
            return;
        }
        String DATA_FILE_PATH = prop.getProperty("data_file_path");
        DataGeneratorDao dataSaver = new DataGeneratorDaoImpl(DATA_FILE_PATH);

        List<Channel> channels = DataGenerator.generateChannels(Integer.parseInt(prop.getProperty("num_channels")));


        dataSaver.saveChannels(channels);
    }


}
