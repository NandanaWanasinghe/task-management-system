package com.ShieldTechnologies.taskmanagementsystem.service.serviceIMPL;

import com.ShieldTechnologies.taskmanagementsystem.dto.request.UserSaveRequestDTO;
import com.ShieldTechnologies.taskmanagementsystem.entity.User;
import com.ShieldTechnologies.taskmanagementsystem.repo.UserRepo;
import com.ShieldTechnologies.taskmanagementsystem.service.UserService;
import com.ShieldTechnologies.taskmanagementsystem.util.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserMapper userMapper;
    @Override
    public String addUser(UserSaveRequestDTO userSaveRequestDTO) {
        User user = userMapper.RequestDtoToEntity(userSaveRequestDTO);
        if (!userRepo.existsById(user.getUserId())){
            return userRepo.save(user).getName();
        }else {
            throw new RuntimeException("Already Exist");
        }
    }
}
