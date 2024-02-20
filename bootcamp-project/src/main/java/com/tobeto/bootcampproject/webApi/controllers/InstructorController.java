package com.tobeto.bootcampproject.webApi.controllers;


import com.tobeto.bootcampproject.model.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcampproject.model.entities.Instructor;
import com.tobeto.bootcampproject.service.InstructorCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/instructors")
@RequiredArgsConstructor
public class InstructorController {
    private final InstructorCreateService  instructorCreateService;
    // TODO : Instructor oluşturma
    // TODO : Instructor id üzerinden erişme
    // TODO : Bütün Instructor'lara erişme
    // TODO : Id değeri URL üzerinden belirtilen Instructor'ı güncelleyen end point
    // TODO : Id değeri URL üzerinden belirtilen Instructor'ı silen end point

    @PostMapping
    public Instructor createInstructor(
            @RequestBody final InstructorCreateRequest instructorCreateRequest
            ){

        final Instructor createdInstructor=instructorCreateService.create(instructorCreateRequest);

        return createdInstructor;
    }
}
