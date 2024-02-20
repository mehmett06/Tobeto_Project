package com.tobeto.bootcampproject.model.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TBL_EMPLOYEE")
public class Employee extends Users {
    @Column(name = "USER_POSITION")
    private String position;
}
