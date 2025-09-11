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

  @GetMapping("/{id}")
  public ResponseEntity<User> findById(@PathVariable Integer id) {
    return ResponseEntity.ok().body(userService.findById(id));
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

  @PutMapping("/{id}")
  public ResponseEntity<User> updateById(@PathVariable Integer id, @RequestBody User user) {
    userService.update(id, user);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping
  public ResponseEntity<User> deleteByEmail(@RequestParam String email) {
    userService.deleteByEmail(email);
    return ResponseEntity.ok().build();
  }
}
