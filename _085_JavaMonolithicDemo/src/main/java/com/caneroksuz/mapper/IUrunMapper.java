package com.caneroksuz.mapper;

import com.caneroksuz.dto.request.UrunSaveRequestDto;
import com.caneroksuz.dto.response.UrunFindAllResponseDto;
import com.caneroksuz.repository.entity.Urun;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUrunMapper {
    IUrunMapper INSTANCE= Mappers.getMapper(IUrunMapper.class);

    Urun toUrun(final UrunSaveRequestDto dto);
    UrunFindAllResponseDto fromUrun(final Urun urun);
}
