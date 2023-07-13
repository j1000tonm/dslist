package com.j1000tonm.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.j1000tonm.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
