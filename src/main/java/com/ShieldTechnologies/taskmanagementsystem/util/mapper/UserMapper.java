package com.ShieldTechnologies.taskmanagementsystem.util.mapper;

import com.ShieldTechnologies.taskmanagementsystem.dto.request.UserSaveRequestDTO;
import com.ShieldTechnologies.taskmanagementsystem.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User RequestDtoToEntity (UserSaveRequestDTO userSaveRequestDTO);
}

