package com.flapkap.Vendingmachine.repository;


import com.flapkap.Vendingmachine.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
