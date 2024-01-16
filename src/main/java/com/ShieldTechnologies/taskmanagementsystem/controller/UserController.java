package com.ShieldTechnologies.taskmanagementsystem.controller;

import com.ShieldTechnologies.taskmanagementsystem.dto.request.UserSaveRequestDTO;
import com.ShieldTechnologies.taskmanagementsystem.service.UserService;
import com.ShieldTechnologies.taskmanagementsystem.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/add-user")
    public ResponseEntity<StandardResponse>addUser(@RequestBody UserSaveRequestDTO userSaveRequestDTO){
        String id = userService.addUser(userSaveRequestDTO);
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(201, userSaveRequestDTO.getName() + "saved successfully", id),
                HttpStatus.CREATED
        );
    }
}