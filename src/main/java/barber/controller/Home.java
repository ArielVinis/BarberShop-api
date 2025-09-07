package barber.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

  @GetMapping("/")
  public String home() {
    return """
              Bem-vindo à página Home.
              \nPara ver a documentação, acesse o Swagger.
            """;
  }
}
