package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // @RestController를 사용하면 @ResponseBody 필요 X
public class BoardController {
	@Autowired
	private BoardService boardService;

	@GetMapping("/board/write")
	@ResponseBody // return값을 브라우저에 곧바로 뿌린다.
	public String write() {
		boardService.write();
		
		return "게시판 등록 성공";
	}
	
	@GetMapping("/board/getBoardList")
	@ResponseBody
	public List<BoardDTO> getBoardList() {
		List<BoardDTO> list = boardService.getBoardList();
		
		return list;
		
	}
}