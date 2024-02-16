package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="applicants")
@EqualsAndHashCode(callSuper = true)
public class Applicant extends User<Integer>{

    @Column(name="name")
    private String about;

    @Column(name="instructorId")
    private String instructor;

}
