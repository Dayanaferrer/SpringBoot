package com.primeiroprojeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
