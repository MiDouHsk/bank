package com.rs.bankapp_v3.service;


import com.rs.bankapp_v3.models.entity.User;

public interface UserService {
    User registerUser(User user);
    User getUserByAccountNumber(String accountNumber);
    void saveUser(User user);
    User updateUser(User user);
}
