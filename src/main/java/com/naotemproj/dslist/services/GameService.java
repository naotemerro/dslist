package com.naotemproj.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naotemproj.dslist.dto.GameMinDTO;
import com.naotemproj.dslist.entities.Game;
import com.naotemproj.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
		
	public List<GameMinDTO> findAll() {
			List<Game> result = gameRepository.findAll();
			return result.stream().map(x -> new GameMinDTO(x)).toList();
			
		}
	}
