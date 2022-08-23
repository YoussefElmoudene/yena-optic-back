package com.yena.yenaoptic.User;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByEmail(String email);

    void deleteById(Long id);

    User findByUsername(String username);

    int deleteByUsername(String username);

}