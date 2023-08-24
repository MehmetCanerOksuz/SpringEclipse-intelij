package com.caneroksuz.mapper;

import com.caneroksuz.dto.request.MusteriSaveRequestDto;
import com.caneroksuz.dto.response.MusteriFindAllResponseDto;
import com.caneroksuz.repository.entity.Musteri;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IMusteriMapper {
    IMusteriMapper INSTANCE= Mappers.getMapper(IMusteriMapper.class);
    /*
    Bundan sonrasında dönüşüm yapmak istediğiniz sınıflarla iligli metodları yazın.
     */
    MusteriFindAllResponseDto fromMusteri(final Musteri musteri);

    Musteri fromSaveRequestDto(final MusteriSaveRequestDto dto);
}
