package com.example.demo;


import com.example.demo.entity.*;
import com.example.demo.repository.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderHasProductRepository orderHasProductRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void saveAddressTest() {
        Address address = new Address();
        address.setCity("Praha");
        address.setState("Czech Republic");
        address.setPostalCode(54924);
        addressRepository.save(address);

        List<Address> all = addressRepository.findAll();
        assertThat(all, hasSize(1));
    }

    @Test
    public void deleteAddressTest() {
        Address address = new Address();
        address.setCity("Praha");
        address.setState("Czech Republic");
        address.setPostalCode(54924);
        addressRepository.save(address);

        List<Address> all = addressRepository.findAll();
        assertThat(all, hasSize(1));

        addressRepository.delete(address);

        all = addressRepository.findAll();
        assertThat(all, hasSize(0));
    }

    @Test
    public void saveOrderTest() {
        Order order = new Order();
        order.setState(State.NEW);
        orderRepository.save(order);

        List<Order> all = orderRepository.findAll();
        assertThat(all, hasSize(1));
    }

    @Test
    public void deleteOrderTest() {
        Order order = new Order();
        order.setState(State.NEW);
        orderRepository.save(order);

        List<Order> all = orderRepository.findAll();
        assertThat(all, hasSize(1));

        orderRepository.delete(order);

        all = orderRepository.findAll();
        assertThat(all, hasSize(0));
    }


    @Test
    public void saveOrderHasProductTest() {
        OrderHasProduct hasProduct = new OrderHasProduct();

        Order order = new Order();
        order.setState(State.NEW);
        orderRepository.save(order);
        Product product = new Product();
        product.setName("Auto");
        productRepository.save(product);

        hasProduct.setOrder(order);
        hasProduct.setProduct(product);
        hasProduct.setAmount(10);
        orderHasProductRepository.save(hasProduct);

        List<OrderHasProduct> all = orderHasProductRepository.findAll();
        assertThat(all, hasSize(1));
    }

    @Test
    public void deleteOrderHasProductTest() {
        OrderHasProduct hasProduct = new OrderHasProduct();
        orderHasProductRepository.save(hasProduct);

        List<OrderHasProduct> all = orderHasProductRepository.findAll();
        assertThat(all, hasSize(1));

        orderHasProductRepository.delete(hasProduct);

        all = orderHasProductRepository.findAll();
        assertThat(all, hasSize(0));
    }

    @Test
    public void savePersonTest() {
        Person person = new Person();
        person.setFirstName("Pepa");
        person.setLastName("Novak");
        person.setAge((byte)5);

        personRepository.save(person);

        List<Person> all = personRepository.findAll();
        assertThat(all, hasSize(1));
    }

    @Test
    public void deletePersonTest() {
        Person person = new Person();
        person.setFirstName("Pepa");
        person.setLastName("Novak");
        person.setAge((byte)5);
        personRepository.save(person);

        List<Person> all = personRepository.findAll();
        assertThat(all, hasSize(1));

        personRepository.delete(person);

        all = personRepository.findAll();
        assertThat(all, hasSize(0));
    }

    @Test
    public void saveProductTest() {
        Product product = new Product();
        product.setName("Auto");
        productRepository.save(product);

        List<Product> all = productRepository.findAll();
        assertThat(all, hasSize(1));
    }

    @Test
    public void deleteProductTest() {
        Product product = new Product();
        product.setName("Auto");
        productRepository.save(product);

        List<Product> all = productRepository.findAll();
        assertThat(all, hasSize(1));

        productRepository.delete(product);

        all = productRepository.findAll();
        assertThat(all, hasSize(0));
    }
}
