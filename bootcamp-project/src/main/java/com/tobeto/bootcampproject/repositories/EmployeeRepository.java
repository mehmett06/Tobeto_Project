package com.tobeto.bootcampproject.repositories;

import com.tobeto.bootcampproject.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Optional<Employee> findEmployeeByPassword(
            final String password
    );
}
