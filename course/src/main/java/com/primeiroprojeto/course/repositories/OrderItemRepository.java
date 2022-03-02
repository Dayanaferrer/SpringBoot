package com.primeiroprojeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
