package com.cydeo.entity;

import com.cydeo.enums.CartState;
import jakarta.persistence.*;
import lombok.Data;
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
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "discount_id")
    private Discount discount;

    @OneToMany(mappedBy = "cart")
    private Set<CartItem> cartItems;

    @Override
    public String toString() {
        return "Cart{" +
                "cartState=" + cartState +
                ", customer=" + customer +
                ", discount=" + discount +
                '}';
    }
}
