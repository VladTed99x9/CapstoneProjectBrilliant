package ConnectionProvider;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionProvider {
    private final String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    private final String dbConnectionURL = "jdbc:mysql://127.0.0.1:3307/library";
    private final String dbUsername = "root";
    private final String dbPassword = "Vlad09276281296";

    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public String getDbConnectionURL() {
        return dbConnectionURL;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    

}
