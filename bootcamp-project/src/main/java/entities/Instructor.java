package entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import jakarta.persistence.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="instructors")
@EqualsAndHashCode(callSuper = true)
public class Instructor extends User<Integer>{

    @Column(name="company name ")
    private String companyName;

    @Column(name="employeeId ")
    private Employee employee;

    @Column(name="instructor")
    private List<Applicant>applicants;
}
