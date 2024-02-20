package com.tobeto.bootcampproject.dataAccess;

import com.tobeto.bootcampproject.model.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor,String> {
}
