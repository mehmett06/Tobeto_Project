package entities;
import common.model.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)


public abstract class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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
