package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "customer")
public class Customer extends BaseEntity{

    private String email;
    @Column(name = "first_name")  // good practice in case in the future db changes from postgres
    private String firstName;
    private String lastName;
    private String userName;
}
