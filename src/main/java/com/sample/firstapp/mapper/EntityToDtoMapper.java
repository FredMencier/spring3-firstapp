package com.sample.firstapp.mapper;

import com.sample.firstapp.dto.PersonDto;
import com.sample.firstapp.entity.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface EntityToDtoMapper {
    PersonDto userToPersonDto(Person source);
}
