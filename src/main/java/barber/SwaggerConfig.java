package barber;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("BarberShop - Rest API")
            .description("REST API para barbearia")
            .version("1.0")
            .termsOfService("Termo de uso: Uso privado")
            .contact(new Contact()
                .name("Ariel França")
                .url("https://www.linkedin.com/in/arielvinis/")
                .email("ariel.franca@hotmail.com"))
            .license(new License()
                .name("Licença - France Technology")
                .url("https://www.linkedin.com/in/arielvinis/")));
  }
}
