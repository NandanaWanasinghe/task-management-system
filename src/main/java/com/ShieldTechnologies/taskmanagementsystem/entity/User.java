package com.ShieldTechnologies.taskmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @Column(name = "user_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column(name = "name", length = 100, nullable = false)
    private String Name;

    @Column(name = "description", length = 150)
    private String description;

    @Column(name = "assigned_by", length = 15)
    private String assignedBy;

    @Column(name = "assigned_for")
    private String assignedFor;

    @Column(name = "assign_ate")
    private LocalDate assignDate;

    @Column(name = "deadline")
    private LocalDate deadline;
}
