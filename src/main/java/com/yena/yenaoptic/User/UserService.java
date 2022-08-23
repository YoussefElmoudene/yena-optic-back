package com.yena.yenaoptic.User;

import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    ResponseEntity<User> signIn(User user);

    User save(User user) throws Exception;

    List<User> findAll();

    String generatePassword();

    void deleteUserById(Long id);

    User updateUser(User user);
    User findByEmail(String email) throws Exception;
}
