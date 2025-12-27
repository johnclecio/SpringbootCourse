package com.educandoweb.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.couser.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
