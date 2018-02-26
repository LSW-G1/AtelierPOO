package Televisions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class JVDCTVDAO extends DAO implements TVDAO{

    /**P
     * Add a TV into the DB
     * @param TV televisionTHE SQL QUERY
     */
    @Override
    public void insert(TV television) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO TV(id, brand) VALUES (null, ?)");
            preparedStatement.setString(1, television.getBrand());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Select all TVs from DB
     * @return Collection
     */
    @Override
    public List<TV> selectAll() {
        List<TV> televisions = new LinkedList<>();

        try {
            // CREATE & EXECUTE THE QUERY
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Authorization, Channel, TV WHERE Authorization.channelId = Channel.id AND Authorization.TVId = TV.id;");

            // PARSE EACH LINE AND ADD TO List
            TV television;
            Channel channel;
            while (resultSet.next())
            {

                // Index 2 doesn't exist -> 2 channel for TV3 -> crash?
                try
                {
                    TV tv = televisions.get(resultSet.getInt("TVId") -1);
                    tv.addChannel(new Channel(resultSet.getString("name"), resultSet.getInt("channelId")));
                    televisions.set(resultSet.getInt("TVId") -1, tv);
                }
                catch (IndexOutOfBoundsException e)
                {
                    television = new TV(resultSet.getString(("brand")));
                    television.addChannel(new Channel(resultSet.getString("name"), resultSet.getInt("channelId")));
                    televisions.add(television);
                }
            }

            // CLOSE THE QUERY / CONNECTION
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // RETURN THE LIST
        return televisions;
    }
}
