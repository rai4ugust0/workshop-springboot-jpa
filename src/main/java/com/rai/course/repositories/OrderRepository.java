package com.rai.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
