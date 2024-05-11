package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@Table(name = "balance")
public class Balance extends BaseEntity{

    @Column(precision = 19,scale = 2) // default for Bigdecimal is 38,2
    private BigDecimal amount;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
