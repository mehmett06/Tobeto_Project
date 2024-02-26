package com.tobeto.bootcampproject.model.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "USERS")//users olması gerekiyor user olamaz keyword olduğu
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer id;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirthday;
    @Column(name = "NATIONAL_IDENTITY")
    private String nationalIdentity;
    @Column(name = "USER_EMAIL")
    private String email;
    @Column(name = "USER_PASSWORD")
    private String password;
}
