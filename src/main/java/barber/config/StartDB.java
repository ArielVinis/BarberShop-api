package barber.config;

import barber.model.User;
import barber.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local_startDB")
public class StartDB implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void run(String... args) throws Exception {
    User user1 = User.builder()
            .name("Ariel Franca")
            .email("ariel@email.com")
            .password("teste123")
            .build();

    User user2 = User.builder()
            .name("Vitoria Vizzotto")
            .email("vitoria@email.com")
            .password("teste123")
            .build();

    userRepository.saveAll(List.of(user1, user2));
  }
}
