package Televisions.DAO;

import Televisions.Channel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Channels extends DAO
{
    public void insert(Channel channel) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Channel(id, name, number) VALUES (null, ?, ?)");
            preparedStatement.setString(1, channel.getName());
            preparedStatement.setInt(2, channel.getNumber());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Channel> selectAll() {
        List<Channel> channels = new LinkedList<>();

        try {
            // CREATE & EXECUTE THE QUERY
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Channel");

            // PARSE EACH LINE AND ADD TO List
            Channel channel;
            while (resultSet.next())
            {
                channel = new Channel(resultSet.getString(("name")), resultSet.getInt("number"));
                channels.add(channel);
            }

            // CLOSE THE QUERY / CONNECTION
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // RETURN THE LIST
        return channels;
    }
}
