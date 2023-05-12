import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private final String url = "jdbc:postgresql//localhost:5432/db";
    private final String user = "user";
    private final String password = "password";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Successfully connected to PostgreSQL");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void runPostgresDockerImage() throws IOException {
        String[] path = {"/Users/edgar/IdeaProjects/spring-boot-project/src/main/resources/dockerTest/script.sh"};
        Process process = Runtime.getRuntime().exec(path);
    }

}
