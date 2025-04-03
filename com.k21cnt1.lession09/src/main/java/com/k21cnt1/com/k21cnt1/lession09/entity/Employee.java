package com.k21cnt1.com.k21cnt1.lession09.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullname;

    private String email;

    private String phone;

    private String address;

    private LocalDate birthday;

    private String status;
}
