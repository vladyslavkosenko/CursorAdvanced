package hw4;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost";
        String userName = "user";
        String password = "^rMR4Rz2&7DF";

        try {
            DriverManager.registerDriver(new SQLServerDriver());
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}