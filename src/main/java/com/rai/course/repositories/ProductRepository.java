package com.rai.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
