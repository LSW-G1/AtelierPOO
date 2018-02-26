package Televisions;

import java.util.List;

public interface ChannelDAO {

    void insert(Channel channel);
    List<Channel> selectAll();

}
