package com.myproject.datasourceproject.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.datasourceproject.mysql.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
