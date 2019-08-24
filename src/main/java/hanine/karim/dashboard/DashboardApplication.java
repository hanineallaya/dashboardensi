package hanine.karim.dashboard;

import hanine.karim.dashboard.Dao.IDstore;
import hanine.karim.dashboard.Dao.IdentityManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboardApplication implements CommandLineRunner {
@Autowired
    private IDstore IDstore;
@Autowired
    private IdentityManagement IdentityManagement;

    public static void main(String[] args) {
        SpringApplication.run(DashboardApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
