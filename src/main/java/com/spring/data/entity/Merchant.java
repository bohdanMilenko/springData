package com.spring.data.entity;

import javax.persistence.*;

import java.util.Collection;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
//@Table(name = "merchant")
public class Merchant {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    private String name;
    @Column(name = "need_to_send")
    private int needToSend;
    //name of the merchant object in Payment
//    @OneToMany(mappedBy = "merchant")
    @OneToMany(mappedBy = "merchant", fetch = FetchType.EAGER)
    private Collection<Payment> payment;


    public Merchant() {
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


    public int getNeedToSend() {
        return needToSend;
    }

    public void setNeedToSend(int needToSend) {
        this.needToSend = needToSend;
    }

    public Collection<Payment> getPayment() {
        return payment;
    }

    public void setPayment(Collection<Payment> payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return name;
    }
}
