package dataccess;


import entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ApplicantRepository extends JpaRepository<Applicant,Integer>{
}
