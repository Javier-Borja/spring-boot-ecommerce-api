package com.devsite.ecommerce.user.mapper;

import com.devsite.ecommerce.user.dto.UserRequestDTO;
import com.devsite.ecommerce.user.dto.UserResponseDTO;
import com.devsite.ecommerce.user.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toUser(UserRequestDTO userRequestDTO);

    UserResponseDTO toUserResponseDTO(User user);
}
