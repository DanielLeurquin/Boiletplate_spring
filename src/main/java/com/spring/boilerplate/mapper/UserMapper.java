package com.spring.boilerplate.mapper;


import com.spring.boilerplate.dal.model.dto.UserDto;
import com.spring.boilerplate.dal.model.postgres.User;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public interface UserMapper {

    static UserMapper instance() {
        return Mappers.getMapper(UserMapper.class);
    }
    UserDto convertToDto(User user);


}