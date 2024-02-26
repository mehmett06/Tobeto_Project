package com.tobeto.bootcampproject.business.concretes.İmpl.Instructor;

import com.tobeto.bootcampproject.business.abstracts.ınstructor.InstructorCreateService;
import com.tobeto.bootcampproject.core.mapper.ModelMapperService;
import com.tobeto.bootcampproject.repositories.InstructorRepository;
import com.tobeto.bootcampproject.business.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcampproject.model.entities.Instructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor//gerekli alanları kullanarak constructor oluşturuyor.
 class InstructorCreateServiceImpl implements InstructorCreateService {

    private final InstructorRepository instructorRepository;//veritabanına bağlanmak için çağırdık
    private final ModelMapperService modelMapperService;

    @Override
    public Instructor create(final InstructorCreateRequest instructorCreateRequest)// burda Instructır
    //bu method request isteğine göre çalışsın burda istek alıyoruz//kaydetme işlemine denir burda reques ve response ihtiyacımız var.
    {
        final Instructor instructorToBeSave = modelMapperService.forRequest()
                //burdaki olay isteği alıyoruz hem repoya hemde hemde ınstructor cllassına alıp kaydediyoruz.
                //Instructor tablosuna kaydediyoruz.
                .map(instructorCreateRequest, Instructor.class);//gelen bilgiyi uygun hale çevir ve Instructor ile kaydet

        return instructorRepository.save(instructorToBeSave);//Jpa içine ulaştık .save ile kaydettik ıd ile return ile  geri dönüyor
    }
}
//@RequestMapping("/api/v1/instructors") local hostu çağırıyoruz
//gerekli bilgileri mapleyerek database gönderiyoruz.

//instructorToBeSave şuan burda database içinde model mapper içine attığım json formatında ki verilerim geliyor