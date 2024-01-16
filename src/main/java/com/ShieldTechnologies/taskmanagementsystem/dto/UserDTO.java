package com.ShieldTechnologies.taskmanagementsystem.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    private int userId;

    private String Name;

    private String description;

    private String assignedBy;

    private String assignedFor;

    private LocalDate assignDate;

    private LocalDate deadline;
}
