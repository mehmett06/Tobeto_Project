package com.tobeto.bootcampproject.webApi.controllers;

import com.tobeto.bootcampproject.business.abstracts.ınstructor.InstructorCreateService;
import com.tobeto.bootcampproject.business.abstracts.ınstructor.InstructorService;
import com.tobeto.bootcampproject.business.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcampproject.business.dto.instructor.response.InstructorCreateResponse;
import com.tobeto.bootcampproject.core.mapper.ModelMapperService;
import com.tobeto.bootcampproject.model.entities.Instructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//JSONdan gelen istekleri kabul et
@RequestMapping("/api/v1/instructors")//isteği kabul edecek yol
@RequiredArgsConstructor// bu
public class InstructorController {
    private final InstructorCreateService instructorCreateService;
    private final ModelMapperService modelMapperService;
    private final InstructorService instructorService;
    // TODO : Instructor oluşturma
    // TODO : Instructor id üzerinden erişme
    // TODO : Bütün Instructor'lara erişme
    // TODO : Id değeri URL üzerinden belirtilen Instructor'ı güncelleyen end point
    // TODO : Id değeri URL üzerinden belirtilen Instructor'ı silen end point
    @PostMapping// bu post ekleme kısmı buton gibi submit kısmı düşünebiliriz
    public Instructor createInstructor(//classın içince create Instructor diyoruz
            @RequestBody final InstructorCreateRequest instructorCreateRequest//json dosyasını gösteriyoruz.
            ){

        final Instructor createdInstructor=instructorCreateService.create(instructorCreateRequest);
        return createdInstructor;
    }
    @GetMapping("/{instructorId}")
    public InstructorCreateResponse getById(
            @PathVariable("instructorId") final Integer instructorId
    ) {
        Instructor instructor = instructorService.getById(instructorId);
        InstructorCreateResponse instructorResponse = modelMapperService.forResponse()
                .map(instructor,InstructorCreateResponse.class);
        return instructorResponse;

    }
    @GetMapping
    public List<Instructor> getAllInstructor(){
        return  instructorService.getAllInstructors();
    }
}









//burdaki url kısmına gidiyoruz oluşturduğumuz service kısmına gidiyoruz
//postmapping kısmında oluşturma işlemi yapıyoruz.
//Instructor classının içine giriyoruz. oraya ekleme yapıyoruz.
//Body kısmında girdiğimiz veriler dto olarak geliyor.
