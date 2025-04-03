package com.k21cnt1.lession11.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "Nvt")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Nvt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Nvt_id;
    private String Nvt_user;
    private String Nvt_pass;
    private String Nvt_email;
    private String Nvt_phone;
    private String Nvt_address;
    private String Nvt_status;
}
