package com.rai.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.course.entities.OrderItem;
import com.rai.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
