package com.j1000tonm.dslist.dto;

import com.j1000tonm.dslist.entities.GameList;

public class GameListDTO {
	
	private Long id;
	private String name;

	public GameListDTO() {
	}
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
