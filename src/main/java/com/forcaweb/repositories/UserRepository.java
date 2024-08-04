package com.forcaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forcaweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
