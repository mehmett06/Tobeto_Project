package com.tobeto.bootcampproject.model.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "TBL_EMPLOYEE")
public class Employee extends Users {
    @Column(name = "USER_POSITION")
    private String position;
}
// userde ıd yazdığımız için bize kızmıyor
// burda bize veriyor zaten extends yaparak
