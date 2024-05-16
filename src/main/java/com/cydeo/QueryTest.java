package com.cydeo;

import com.cydeo.entity.CartItem;
import com.cydeo.enums.CartState;
import com.cydeo.enums.DiscountType;
import com.cydeo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class QueryTest implements CommandLineRunner {

    private final AddressRepository addressRepository;
    private final BalanceRepository balanceRepository;
    private final CartItemRepository cartItemRepository;
    private final CartRepository cartRepository;
    private final CategoryRepository categoryRepository;
    private final CustomerRepository customerRepository;
    private final DiscountRepository discountRepository;
    private final OrderRepository orderRepository;
    private final PaymentRepository paymentRepository;
    private final ProductRepository productRepository;


    public QueryTest(AddressRepository addressRepository, BalanceRepository balanceRepository,
                     CartItemRepository cartItemRepository, CartRepository cartRepository,
                     CategoryRepository categoryRepository, CustomerRepository customerRepository,
                     DiscountRepository discountRepository, OrderRepository orderRepository,
                     PaymentRepository paymentRepository, ProductRepository productRepository) {
        this.addressRepository = addressRepository;
        this.balanceRepository = balanceRepository;
        this.cartItemRepository = cartItemRepository;
        this.cartRepository = cartRepository;
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
        this.discountRepository = discountRepository;
        this.orderRepository = orderRepository;
        this.paymentRepository = paymentRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------ADDRESS----------------");

        //System.out.println(addressRepository.getByStreetStartsWith("An"));
        //System.out.println(addressRepository.getTop3ByCustomer_Email("bmaccaughey2@wufoo.com"));
        //System.out.println(addressRepository.retrieveAddressByCustomerId(1L));

        System.out.println("------------BALANCE----------------");

        //System.out.println(balanceRepository.retrieveTop5MaxBalanceAmount());
        //System.out.println(balanceRepository.getByAmountIsGreaterThanEqual(BigDecimal.valueOf(995)));
        //System.out.println(balanceRepository.retrieveBalancesLessThan(BigDecimal.valueOf(10)));

        System.out.println("------------CARTITEM----------------");

        //System.out.println(cartItemRepository.countBy());
        //System.out.println(cartItemRepository.countBy());  //1998
        //System.out.println(cartItemRepository.getByCart_CartState(CartState.SOLD));
        //System.out.println(cartItemRepository.getByCart_CartStateAndProduct_Name(CartState.SOLD, "Tomatoes"));
        System.out.println(cartItemRepository.retrieveByCartStateAndProduct_Name(CartState.SOLD, "Tomatoes"));   // ERROR
        //System.out.println(cartItemRepository.retrieveByCartStateAndNoDiscount(CartState.SOLD));  //Error

        System.out.println("------------CART----------------");

        //System.out.println(cartRepository.getByDiscount_DiscountType(DiscountType.RATE_BASED));
        //System.out.println(cartRepository.retrieveByCustomerId(1L));

        System.out.println("------------CATEGORY----------------");

        //System.out.println(categoryRepository.retrieveByCategoryName("Fire Protection"));
        //System.out.println(categoryRepository.getTop3ByOrderByNameDesc());

        System.out.println("------------CUSTOMER----------------");

        //System.out.println(customerRepository.getByUserName("asturton0"));
        //System.out.println(customerRepository.retrieveByEmail("asturton0@list-manage.com"));

        System.out.println("------------DISCOUNT----------------");

        //System.out.println(discountRepository.getByDiscountGreaterThan(BigDecimal.valueOf(10)));
        //System.out.println(discountRepository.getByDiscountType(DiscountType.RATE_BASED));
        //System.out.println(discountRepository.retrieveDiscountBetween(BigDecimal.valueOf(30),BigDecimal.valueOf(60)));

        System.out.println("------------ORDER----------------");

        //System.out.println(orderRepository.getTop5ByOrderByTotalPriceDesc());
        //System.out.println(orderRepository.existsOrderByCustomer_Email("asturton0@list-manage.com"));  //true
        //System.out.println(orderRepository.retrieveEqualTotalAndPaidPrice());

        System.out.println("------------PAYMENT----------------");

        //System.out.println(paymentRepository.retrieveSumOfAllPayments());
        //System.out.println(paymentRepository.retrieveAverageOfAllPayments());

        System.out.println("------------PRODUCT----------------");

        //System.out.println(productRepository.getProductByName("Clams - Bay"));
        //System.out.println(productRepository.countByPriceGreaterThan(BigDecimal.valueOf(99)));


    }
}
