import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {
    public static void main(String[] args) {
       //establish the database connection
       //1. url,user name password database name
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/javatrainingdb";
        //to make the connection

        try {
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("Database connetion established");
            String query= "INSERT INTO Trainer VALUES";

        } catch (SQLException e) {
            throw new RuntimeException("Db not connected "+e);
        }
    }
}
