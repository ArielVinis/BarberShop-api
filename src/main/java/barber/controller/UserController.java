package barber.controller;

import barber.model.User;
import barber.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

  private final UserService userService;

  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    return ResponseEntity.ok().body(userService.findAll());
  }

  @GetMapping("/{email}")
  public ResponseEntity<User> findByEmail(@PathVariable String email) {
    return ResponseEntity.ok(userService.findByEmail(email));
  }

  @PostMapping
  public ResponseEntity<User> post(@RequestBody User user) {
    User saved = userService.save(user);
    return ResponseEntity.ok(saved);
  }

  @PutMapping
  public ResponseEntity<User> updateById(@RequestParam Integer id, @RequestBody User user) {
    userService.updateById(id, user);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping
  public void deleteByEmail(@RequestParam String email) {
    userService.deleteByEmail(email);
  }
}
