package com.tobeto.bootcampproject.core.mapper;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
    ModelMapper forRequest();
    ModelMapper forResponse();
}
//burda hem isteklerim
//hemde cevaplarım oluyor.
//bunları service(business) kısmında kullanıyorum.
//map isteğime göre burda dögü oluyor