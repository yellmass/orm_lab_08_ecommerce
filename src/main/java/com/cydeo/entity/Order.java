package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
@Table(name = "orders")
public class Order extends BaseEntity{

    @Column(name = "paid_price", precision = 19, scale = 2)  // numeric(19,2)
    private BigDecimal paidPrice;
    @Column(name = "total_price", precision = 19, scale = 2)
    private BigDecimal totalPrice;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private Cart cart;
    @ManyToOne(fetch = FetchType.LAZY) // by default OneToOne and ManyToOne is EAGER
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "payment_id")
    private Payment payment;
}
