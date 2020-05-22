package com.spring.data.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Customer {

    //How to map Composition?
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "payment", joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "merchant_id")   )
    private Collection<Merchant> merchant;

    public Customer() {
    }

    public Customer(int id, String name, String address, Collection<Merchant> merchant) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.merchant = merchant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Collection<Merchant> getMerchant() {
        return merchant;
    }

    public void setMerchant(Collection<Merchant> merchant) {
        this.merchant = merchant;
    }

    @Override
    public String toString() {
        return name + " lives at " + address;
    }
}
