package com.enzo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzo.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
