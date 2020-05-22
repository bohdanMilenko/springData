package com.spring.data.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
public class Payment {

    public Payment() {
    }

    public Payment(int id, int sumCharged, Merchant merchant, LocalDateTime dt) {
        this.id = id;
        this.sumCharged = sumCharged;
        this.merchant = merchant;
        this.dt = dt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int id;

    @Column(name = "sum_charged")
    private int sumCharged;

    @ManyToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "payment_date_time")
    private LocalDateTime dt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSumCharged() {
        return sumCharged;
    }

    public void setSumCharged(int sumCharged) {
        this.sumCharged = sumCharged;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public LocalDateTime getDt() {
        return dt;
    }

    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }


    @Override
    public String toString() {
        return dt + ": " + sumCharged + " was charged by " + merchant.toString();
    }
}
