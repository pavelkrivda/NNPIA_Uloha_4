package com.example.demo;

import com.example.demo.entity.Product;
import com.example.demo.repository.OrderHasProductRepository;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderHasProductRepository orderHasProductRepository;
    @Autowired
    private OrderRepository orderRepository;


//    @Test
//    void exampleTest(){
//
//        Product product = new Product();
//        product.setProductName("MyProduct");
//
//        productRepository.save(product);
//
//        List<Product> all = productRepository.findAll();
//
//        product.setProductName("MyProduct2");
//        productRepository.save(product);
//
//       Product constains2 = productRepository.findProductByProductNameContains("2");
//
//
//       List<Product> productByIdBetween = productRepository.findProductByIdBetween(5L, 7L);
//
//
//       List<Product> sortAscById = productRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
//       List<Product> sortDescById = productRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
//    }

//    @Test
//    void saveProductTest() {
//        Product product = new Product();
//        product.setProductName("MyProduct");
//        productRepository.save(product);
//
//        Order order = new Order();
//        order.setState(State.NEW);
//        orderRepository.save(order);
//
//        OrderHasProduct orderHasProduct1 = new OrderHasProduct();
//        orderHasProduct1.setProduct(product);
//        orderHasProduct1.setAmount(6);
//        orderHasProduct1.setOrder(order);
//        orderHasProductRepository.save(orderHasProduct1);
//
//        OrderHasProduct orderHasProduct2 = new OrderHasProduct();
//        orderHasProduct2.setProduct(product);
//        orderHasProduct2.setAmount(6);
//        orderHasProduct2.setOrder(order);
//        orderHasProductRepository.save(orderHasProduct2);
//
//        List<Order> all = orderRepository.findAll();
//    }

//    @Test
//    void saveProductTest() {
//        Product product = new Product();
//        product.setName("MyProduct");
//        productRepository.save(product);
//
//        List<Product> all = productRepository.findAll();
//        Assertions.assertThat(all.size()).isEqualTo(1);
//    }
}
