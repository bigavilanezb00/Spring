package com.example.Spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersDAO extends JpaRepository<User,Integer> {
    List<User> findAll();
    Optional<User> findById(Integer id);
}
