package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private Set<OrderHasProduct> productInOrders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String productName) {
        this.name = productName;
    }

        public Set<OrderHasProduct> getProductInOrders() {
        return productInOrders;
    }

    public void setProductInOrders(Set<OrderHasProduct> productInOrders) {
        this.productInOrders = productInOrders;
    }
}
