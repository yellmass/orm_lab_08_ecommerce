package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "balance")
public class Balance extends BaseEntity{

    @Column(precision = 19,scale = 2) // default for Bigdecimal is 38,2
    private BigDecimal amount;

    @OneToOne
    @Column(name = "customer_id")
    private Customer customer;
}
