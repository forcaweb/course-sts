package com.forcaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forcaweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
