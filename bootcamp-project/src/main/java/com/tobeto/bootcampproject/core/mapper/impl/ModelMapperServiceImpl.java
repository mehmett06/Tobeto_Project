package com.tobeto.bootcampproject.core.mapper.impl;
import com.tobeto.bootcampproject.core.mapper.ModelMapperService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@Service//servis yazma sebepimiz Ioc yapısına dahil etmek için yapıldı. enjekte yapılıyor.
@AllArgsConstructor
public class ModelMapperServiceImpl implements ModelMapperService {

    private  ModelMapper modelMapper; //servisi imp yaptığım sadece model mapper'ı kullanıyorum.
    @Override
    public ModelMapper forRequest() {
        this.modelMapper.getConfiguration().setAmbiguityIgnored(true)//model mapperın ayarlarına eşleşme ihtimali
                .setMatchingStrategy(MatchingStrategies.LOOSE);//gelen isteklerimde model mapper ayarları yaptım büyük ve küçük harf duyarlılığını kapattık.
        //front end kısmında büyük ve küçük harf duyarlılığı için örnek FİRSTNAME ile firstName eşleştir.
        return this.modelMapper;
    }
    @Override
    public ModelMapper forResponse() {
        this.modelMapper.getConfiguration().setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD);

        return this.modelMapper;
    }
}
//service içerisine doğrudan servisleri yazabiliriz model mapper yapma amacımız ise eşleştirme yapmaya çalışıyoruz gelen json formatındaki yazı ile