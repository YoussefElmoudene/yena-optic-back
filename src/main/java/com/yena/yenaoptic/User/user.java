package com.yena.yenaoptic.User;

import com.yena.yenaoptic.Role.Role;

import javax.persistence.*;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;
@Entity
public class user {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    protected  Long id ;
    protected  String email;
    protected  String fullname;
    protected  String username;
    protected  String password;
    protected  String phone;
    @ManyToMany(fetch = EAGER)
    protected Collection<Role> authorities;
    protected String role;
    protected String image;
    protected String token;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public Collection<Role> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<Role> authorities) {
        this.authorities = authorities;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
