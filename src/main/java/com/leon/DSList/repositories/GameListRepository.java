package com.leon.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leon.DSList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
