package com.devsuperior.revMovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.revMovies.entities.Score;
import com.devsuperior.revMovies.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
