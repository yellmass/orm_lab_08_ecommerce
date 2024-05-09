package com.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;
import java.util.jar.JarEntry;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Product extends BaseEntity{

    private String name;
    @Column(precision = 19, scale = 2)
    private BigDecimal price;
    private Integer quantity;
    @Column(name = "remaining_quantity")
    private Integer remainingQuantity;

//    @ManyToMany
//    @JoinTable(name = "product_category_rel",
//            joinColumns = @JoinColumn(name = "p_id"),
//            inverseJoinColumns = @JoinColumn(name = "c_id")
//    )
//    private Set<Category> categories;
}
