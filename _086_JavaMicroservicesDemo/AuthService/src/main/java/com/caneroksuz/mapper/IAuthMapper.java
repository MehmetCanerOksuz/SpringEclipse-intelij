package com.caneroksuz.mapper;

import com.caneroksuz.dto.request.DoRegisterRequestDto;
import com.caneroksuz.dto.request.UserProfileSaveRequestDto;
import com.caneroksuz.repository.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAuthMapper {

    IAuthMapper INSTANCE = Mappers.getMapper(IAuthMapper.class);

    Auth toAuth(final DoRegisterRequestDto dto);

    /* @Mappings(
             @Mapping(target = "authid", source = "id"),
             @Mapping(target = "firstname", source = "first_name"),
             @Mapping(target = "lastname", source = "last_name")
     )*/
    @Mapping(target = "authid", source = "id")
    UserProfileSaveRequestDto fromAuth(final Auth auth);
}
