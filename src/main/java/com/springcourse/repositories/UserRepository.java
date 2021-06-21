package com.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
