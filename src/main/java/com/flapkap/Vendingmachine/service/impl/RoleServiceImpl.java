package com.flapkap.Vendingmachine.service.impl;


import com.flapkap.Vendingmachine.model.Role;
import com.flapkap.Vendingmachine.repository.RoleRepository;
import com.flapkap.Vendingmachine.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findByName(String name) {
        Role role = roleRepository.findRoleByName(name);
        return role;
    }
}
