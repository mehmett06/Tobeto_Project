package com.tobeto.bootcampproject.business.concretes.İmpl.Instructor;

import com.tobeto.bootcampproject.business.abstracts.ınstructor.InstructorService;
import com.tobeto.bootcampproject.model.entities.Instructor;
import com.tobeto.bootcampproject.repositories.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
 class InstructorServiceImpl implements InstructorService {
    private final InstructorRepository instructorRepository;

    @Override
    public Instructor getById(Integer instructorId) {
        return instructorRepository.findById(instructorId)
                .orElseThrow(() -> new RuntimeException("Bu id'ye sahip bir Instructor bulunamadı!"));

    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }
}
