package com.mycompany.springbootproject.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name= "ngoTable")
public class NGO {
    @Id
    @GeneratedValue
    private Integer ngoId;

    @Size(min=2,max=20)
    @NotNull(message = "Enter NGO name")
    private String ngoName;

    @Size(min=2,max=20)
    @NotNull(message = "Enter User name")
    private String userName;

    @Size(min=2, max=20)
    @NotNull(message = "Enter Password")
    private String password;

    @Size(min=2, max=20)
    @NotNull(message = "Enter Address")
    private String address;

    @NotNull(message = "Enter Phone Number")
    private Integer phone;

    @NotNull(message = "Enter Start Date")
    private LocalDate startedIn;

    private Boolean Documents;


}
