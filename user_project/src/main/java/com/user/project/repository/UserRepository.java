package com.user.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.project.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}