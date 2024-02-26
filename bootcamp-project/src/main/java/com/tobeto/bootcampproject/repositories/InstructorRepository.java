package com.tobeto.bootcampproject.repositories;

import com.tobeto.bootcampproject.model.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor,Integer> {
    Optional<Instructor> findByLastName(String lastName);
}
//Jpa olmasa bize arkadan sql yaaparak tek tek elle yazıyoruz.