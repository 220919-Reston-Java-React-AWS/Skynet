package com.revature.project2Data.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "transactions")
public @Data class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Timestamp date;
    private int totalAmount;
    private String note;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "from_account_id")
//    private Account fromAccount;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "to_account_id")
//    private Account toAccount;

    public Transaction() {
    }

    public Transaction(int id, Timestamp date, int totalAmount, String note) {

        this.id = id;
        this.date = date;
        this.totalAmount = totalAmount;
        this.note = note;
    }

}