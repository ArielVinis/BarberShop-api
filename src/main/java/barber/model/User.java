package barber.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(nullable = false)
  private String accessLevel;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false, unique = true)
  private String email;
  @Column(nullable = false)
  private String password;

  private Date birthday;
  private String phone;
}
