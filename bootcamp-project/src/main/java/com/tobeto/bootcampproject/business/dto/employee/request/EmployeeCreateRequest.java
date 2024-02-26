package com.tobeto.bootcampproject.business.dto.employee.request;

import com.tobeto.bootcampproject.business.dto.user.request.UserCreateRequest;
import lombok.Getter;

@Getter
public class EmployeeCreateRequest extends UserCreateRequest {
    private String position;
}
//BURDA BİZE KARŞILIK GELEN FİRSTNAME, LASTNAME BIRTHDATE
//BUNLAR İŞTE TAM OLARAK YAPILDIĞI YER BURASI
//Elimiz ile json formatında giriyoruz.
//sonra bunu dto formatına çeviriliyor.
//Model mapperda normalde set halinde girmek yerine
//otomatik olarak giriyoruz.
//jpa database kısmına kendi methodları ile ortak bir şekilde yazılıyor.
