package com.forcaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forcaweb.entities.OrderItem;
import com.forcaweb.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
