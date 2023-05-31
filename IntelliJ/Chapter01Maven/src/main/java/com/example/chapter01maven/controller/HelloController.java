package com.example.chapter01maven.controller;

import board.bean.BoardDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController // @RestController를 쓰면 @ResponsBody 필요없어짐
public class HelloController{

    public HelloController() {
        System.out.println("HelloController 기본 생성자");
    }

    @GetMapping(value = "/")
    public String hello(String name) { // localhost:9000/?name=홍길동
        return "안녕하세요. " + name + "님";
    }

    @GetMapping(value = "board/getBoard")
    public BoardDTO getBoard() {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setSeq(1);
        boardDTO.setSubject("홍길동전");
        boardDTO.setName("허균");
        boardDTO.setContent("안녕");
        boardDTO.setLogtime(new Date());

        return boardDTO;
    }

    @GetMapping(value = "board/getBoardList")
    public List<BoardDTO> getBoardList() {
        List<BoardDTO> list = new ArrayList<>();
        BoardDTO boardDTO = new BoardDTO();

        boardDTO.setSeq(1);
        boardDTO.setSubject("홍길동전");
        boardDTO.setName("허균");
        boardDTO.setContent("안녕");
        boardDTO.setLogtime(new Date());
        list.add(boardDTO);

        BoardDTO boardDTO2 = new BoardDTO();
        boardDTO2.setSeq(2);
        boardDTO2.setSubject("검정고무신");
        boardDTO2.setName("이우영");
        boardDTO2.setContent("기영이");
        boardDTO2.setLogtime(new Date());
        list.add(boardDTO2);

        return list;
    }
}
