package com.java.Security4;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.Security4.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	Optional<User> findByUsername(String username);
}
