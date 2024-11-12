package com.naotemproj.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naotemproj.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	

}
