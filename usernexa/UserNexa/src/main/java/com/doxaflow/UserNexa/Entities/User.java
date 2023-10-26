package com.doxaflow.UserNexa.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "doxaflow_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_name",nullable = false,length = 50)
    private String userName;

    @Column(name = "user_pswd",nullable = false,length = 10)
    private String password;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_age",nullable = false,length = 2)
    private int userAge;
    @Column(name = "D.O.B")
    private Date userDob;
}
