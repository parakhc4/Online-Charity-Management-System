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

@Data
@NoArgsConstructor
@Entity
@Table(name= "donorTable")
public class Donor {
    @Id
    @GeneratedValue
    private Integer donorId;

    @Size(min=2,max=20)
    @NotNull(message = "Enter Donor Name")
    private String donorName;

    @Size(min=2,max=20)
    @NotNull(message = "Enter Donor Username")
    private String userName;

    @Email
    @NotNull(message = "Enter Email address of Admin")
    private String email;

    @NotNull(message = "Enter Phone Number")
    private Integer phoneNumber;

    @Size(min=2, max=20)
    @NotNull(message = "Enter Address")
    private String address;

    @Size(min=2, max=20)
    @NotNull(message = "Enter Password")
    private String password;


}

//DonarId
//DonarName
//UserName
//Email
//PhoneNumber
//Address
//Password
