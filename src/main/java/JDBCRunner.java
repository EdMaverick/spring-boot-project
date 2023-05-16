import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class JDBCRunner implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(JDBCRunner.class, args);
    }

    public void run(String... args) throws Exception {
        String psql = "INSERT INTO students (name, email) VALUES ("
                + "'David', 'david@domain.com')";

        int rows = jdbcTemplate.update(psql);
        if (rows > 0) {
            System.out.println("A new row has been inserted.");
        }
    }

}
