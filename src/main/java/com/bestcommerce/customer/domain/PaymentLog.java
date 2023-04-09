package com.bestcommerce.customer.domain;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "payment_log")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PaymentLog {

    @Id
    @Column(name = "pay_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payNo;

    @Column(name = "total_price")
    private Long totalPrice;

    @Column(name = "pay_date")
    private String payDate;

    @ManyToOne
    @JoinColumn(name = "cu_id")
    private Customer customer;

    public PaymentLog(Long totalPrice, String payDate, Customer customer) {
        this.totalPrice = totalPrice;
        this.payDate = payDate;
        this.customer = customer;
    }

    public void setPayDateForNowDate(String payDate){
        this.payDate = payDate;
    }

    public void addTotalPriceForPaymentInsert(Long price){
        this.totalPrice += price;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}
