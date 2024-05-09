package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "address")
public class Address extends BaseEntity{

    private String name;
    private String street;
    private String zipCode;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
