package com.rs.bankapp_v3.models.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;


import java.util.List;

@Data
@Entity
public class User {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;
    @Column(name = "full_name", nullable = false)
    private String fullname;
    @Column
    private String address;
    @Column(name = "phone_number")
    private String phoneNumber;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Account> accounts;

    public List<Account> getAccount() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
