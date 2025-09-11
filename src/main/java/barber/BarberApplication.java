package barber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BarberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarberApplication.class, args);

		System.out.println("Documentation with Swagger: http://localhost:8080/swagger-ui.html.");
		System.out.println("Tudo OK");
	}

}
