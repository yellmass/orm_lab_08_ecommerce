package com.example.entity;

import com.example.enums.CartState;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cart extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private CartState cartState;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "discount_id")
    private Discount discount;

    @OneToMany(mappedBy = "cart")
    private Set<CartItem> cartItems;
}
