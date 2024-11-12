package com.leon.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leon.DSList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
