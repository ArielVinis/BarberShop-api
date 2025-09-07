package barber.service;

import barber.model.User;
import barber.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public User save(User user) {
    userRepository.save(user);
    return user;
  }

  public void update(Integer id, User user) {
    User userEntity = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario não encontrado."));
    User userUpdated = User.builder()
            .email(user.getEmail() != null ?
                    user.getEmail() : userEntity.getEmail())
            .name(user.getName() != null ?
                    user.getName() : userEntity.getName())
            .id(userEntity.getId())
            .build();

    userRepository.save(userUpdated);
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User findByEmail(String email) {
    return userRepository.findByEmail(email).orElseThrow(
            () -> new RuntimeException("Email não encontrado.")
    );
  }

  public void deleteByEmail(String email) {
    userRepository.deleteByEmail(email);
  }

}
