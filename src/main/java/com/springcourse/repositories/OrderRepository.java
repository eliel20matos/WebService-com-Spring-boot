package com.springcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
