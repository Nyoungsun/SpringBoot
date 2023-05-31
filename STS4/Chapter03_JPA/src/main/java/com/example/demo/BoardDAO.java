package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardDAO extends JpaRepository<BoardDTO, Integer> {
	
}

/*
JpaRepository<T, ID> → T: Entity Class, ID: primary key의 type
*/
