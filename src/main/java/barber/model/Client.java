package barber.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Client {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false, unique = true)
  private String email;
  @Column(nullable = false)
  private String password;

  private char sex;
  private Date birthday;
  private String phone;
  private String address;
  private String cep;
}
