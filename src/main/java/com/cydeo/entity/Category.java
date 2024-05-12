package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Category extends BaseEntity{

    private String name;

    @ManyToMany
    @JoinTable(name = "product_category_rel",
            inverseJoinColumns= @JoinColumn(name = "p_id"),
             joinColumns= @JoinColumn(name = "c_id")
    )
    private Set<Product> products;

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
