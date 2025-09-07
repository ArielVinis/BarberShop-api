package barber.config;

import barber.model.User;
import barber.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

  @Autowired
  private UserRepository userRepository;

  @Bean
  public void startDB() {
    User user1 = new User(1, "Ariel Franca", "ariel@email.com", "teste123");
    User user2 = new User(2, "Vitoria Vizzoto", "vitoria@email.com", "teste123");

    userRepository.saveAll(List.of(user1, user2));
  }
}
