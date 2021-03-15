package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity (name = "order_form")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Person person;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private State state;

    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private Set<OrderHasProduct> orderHasProducts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Set<OrderHasProduct> getOrderHasProducts() {
        return orderHasProducts;
    }

    public void setOrderHasProducts(Set<OrderHasProduct> orderHasProducts) {
        this.orderHasProducts = orderHasProducts;
    }
}
