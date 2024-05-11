package com.cydeo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@Table(name = "customer")
public class Customer extends BaseEntity{

    private String email;
    @Column(name = "first_name")  // good practice in case in the future db changes from postgres
    private String firstName;
    private String lastName;
    private String userName;
}
