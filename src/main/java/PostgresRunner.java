import java.io.IOException;

public class PostgresRunner {

    public static void main(String[] args) throws IOException {
        DBConnection dbConnection = new DBConnection();

        dbConnection.runPostgresDockerImage();
        dbConnection.connect();
    }
}
