package com.devsuperior.revMovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.revMovies.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
