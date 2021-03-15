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
    private ProductRepository productRepository;

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
