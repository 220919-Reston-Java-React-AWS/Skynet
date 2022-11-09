package com.revature.project2Data.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "accounts")
public @Data class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float balance;
    private String nickname;

//    @ManyToOne
//    @JoinColumn(name="fk_account_type", nullable = false)
//    private AccountType accountType;


    @ManyToOne
    @JoinColumn(name = "fk_user_id", nullable = false)
    private User user;

//    @OneToOne(mappedBy = "fromAccount")
//    private Transaction fromAccount;
//
//    @OneToOne(mappedBy = "toAccount")
//    private Transaction toAccount;

    public Account() {
    }

    public Account(int id, float balance, String nickname) {

        this.id = id;
        this.balance = balance;
        this.nickname = nickname;

    }


}