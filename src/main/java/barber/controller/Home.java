package barber.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

  @GetMapping("/")
  public String home() {
    return """
          Bem-vindo à página Home.
          Para ver a documentação, acesse o Swagger.
        """;
  }
}
