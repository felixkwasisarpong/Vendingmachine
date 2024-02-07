package com.flapkap.Vendingmachine.model;


import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public User(String username, String password, double deposit, Set<Role> roles) {
        this.username = username;
        this.password = password;
        this.deposit = deposit;
        this.roles = roles;
    }

    private String username;
    private String password;
    private double deposit;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;

    public User() {

    }




    // Getters and setters

    public User getUser(String username, String password, double deposit, Set<Role> roles) {
        User user = new User();
        user.setUsername(username);
        user.setDeposit(deposit);
        user.setPassword(password);
        user.setRoles(roles);

        return user;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public User getUser() {
        User user = new User();
        user.setUsername(username);
        user.setDeposit(deposit);
        user.setPassword(password);
        user.setRoles(roles);

        return user;
    }


}
