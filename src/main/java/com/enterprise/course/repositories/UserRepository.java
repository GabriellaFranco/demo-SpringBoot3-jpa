package com.enterprise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enterprise.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
