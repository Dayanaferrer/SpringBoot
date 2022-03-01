package com.primeiroprojeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
