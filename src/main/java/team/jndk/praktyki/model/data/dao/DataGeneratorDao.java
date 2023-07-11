package team.jndk.praktyki.model.data.dao;

import team.jndk.praktyki.model.data.Channel;

import java.util.List;

public interface DataGeneratorDao {
    void saveChannels(List<Channel> channels);
}
