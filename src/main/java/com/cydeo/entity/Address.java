package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Table(name = "address")
@Data
public class Address extends BaseEntity{

    private String name;
    private String street;
    private String zipCode;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
