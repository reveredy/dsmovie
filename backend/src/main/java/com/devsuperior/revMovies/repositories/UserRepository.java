package com.devsuperior.revMovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.revMovies.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
