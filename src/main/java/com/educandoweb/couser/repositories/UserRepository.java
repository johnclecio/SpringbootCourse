package com.educandoweb.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.couser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
