package com.flapkap.Vendingmachine.service;


import com.flapkap.Vendingmachine.model.Role;

public interface RoleService {
    Role findByName(String name);
}
