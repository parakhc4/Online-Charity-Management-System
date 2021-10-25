package com.mycompany.springbootproject.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name= "adminTable")
public class Admin {
    @Id
    @GeneratedValue
    private Integer adminId;

    @Size(min=2,max=20)
    @NotNull(message = "Enter Admin UserName")
    private String userName;

    @Size(min=2, max=20)
    @NotNull(message = "Enter Password")
    private String password;

    @Email
    @NotNull(message = "Enter Email address of Admin")
    private String email;

    @NotNull(message = "Enter Phone Number")
    private Integer phoneNumber;




}

//AdminId
//UserName
//Password
//Email
//PhoneNumber
//Address
