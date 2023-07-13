package com.j1000tonm.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j1000tonm.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
