import org.example.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class FipeTableConsultAplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FipeTableConsultAplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal();
        principal.exibeMenu();
    }
}
