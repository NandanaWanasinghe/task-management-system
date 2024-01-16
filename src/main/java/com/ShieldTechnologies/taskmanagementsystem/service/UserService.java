package com.ShieldTechnologies.taskmanagementsystem.service;

import com.ShieldTechnologies.taskmanagementsystem.dto.request.UserSaveRequestDTO;

public interface UserService {
    String addUser(UserSaveRequestDTO userSaveRequestDTO);
}
