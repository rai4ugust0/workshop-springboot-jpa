package com.rai.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
