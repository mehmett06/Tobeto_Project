package com.tobeto.bootcampproject.dataAccess;

import com.tobeto.bootcampproject.model.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,String> {
}

// TODO : İsimlendirme hatalı.