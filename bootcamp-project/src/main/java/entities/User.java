package entities;
import jakarta.persistence.*;
import lombok.*;



@Data
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public class User<T> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="firstname")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="dateOfBirth")
    private String dateOfBirth;

    @Column(name="nationalIdentity")
    private String nationalIdentity;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

}
