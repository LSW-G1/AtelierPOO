package Televisions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

    protected Connection connection;

    /**
     * Creates a MySQL connection
     * Also : Magic.
     * @return
     */
    public Connection getConnection()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            if (connection == null)
            {
                connection = DriverManager.getConnection("jdbc:mysql://192.168.43.100/slam.atelierPOO?user=root&password=root");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
