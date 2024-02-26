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
@Table(name = "TBL_APPLICANT")
public class Applicant extends Users {
    @Column(name = "ABOUT")
    private String about;
}
