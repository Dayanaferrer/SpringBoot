package com.primeiroprojeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
