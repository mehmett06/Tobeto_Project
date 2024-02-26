package com.tobeto.bootcampproject.repositories;

import com.tobeto.bootcampproject.model.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {
}

// burda Jpa kaydetme işini yermiize yapıyor hibernate kullanarak.