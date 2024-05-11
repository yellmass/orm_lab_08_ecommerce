package com.cydeo.repository;

import com.cydeo.entity.CartItem;
import com.cydeo.enums.CartState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    //Write a derived query to get the count of all cart items
    Integer countBy();
    //Write a derived query to get cart items for specific cart state
    List<CartItem> getByCart_CartState(CartState cartState);
    //Write a native query to get cart items for specific cart state and product name
    List<CartItem> getByCart_CartStateAndProduct_Name(CartState cartState, String productName);
    @Query(value = "select * from cart_item ct left join cart c on ct.cart_id=c.id left join product p on ct.product_id=p.id where c.cart_state=:cartState and p.name=:productName",
            nativeQuery = true)
    List<CartItem> retrieveByCartStateAndProduct_Name(@Param(value = "cartState") CartState cartState,@Param(value = "productName") String productName);
    //Write a native query to get cart items for specific cart state and without discount
    @Query(value = "select * from cart_item ct left join cart c on ct.cart_id=c.id where c.cart_state=?1 and c.discount_id is null ",
            nativeQuery = true)
    List<CartItem> retrieveByCartStateAndNoDiscount(CartState cartState);
}
