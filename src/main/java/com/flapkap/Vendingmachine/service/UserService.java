package com.flapkap.Vendingmachine.service;


import com.flapkap.Vendingmachine.model.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    User findOne(String username);
}
