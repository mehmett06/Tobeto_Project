package com.tobeto.bootcampproject.business.dto.instructor.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class InstructorCreateResponse {
    private Integer id;
    private String userName;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirthday;
    private String nationalIdentity;
    private String email;
    private String companyName;
}
