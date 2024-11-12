package com.leon.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leon.DSList.dto.GameMinDTO;
import com.leon.DSList.entities.Game;
import com.leon.DSList.repositories.GameRepository;

@Service
public class GameService {
	
	
	@Autowired
	private GameRepository gameRepository;
	
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}