package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public void write() {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setId("hong");
		boardDTO.setName("허균");
		boardDTO.setSubject("홍길동전");
		boardDTO.setContent("호호호호");
		
		boardDAO.save(boardDTO);
		
		BoardDTO boardDTO2 = new BoardDTO();
		boardDTO2.setId("kim");
		boardDTO2.setName("둘리");
		boardDTO2.setSubject("둘리둘리");
		boardDTO2.setContent("호이");
		
		boardDAO.save(boardDTO2);
	}

	@Override
	public List<BoardDTO> getBoardList() {
		
		return boardDAO.findAll();
	}

}
