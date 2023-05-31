package board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
    public BoardController() {
        System.out.println("BoardController 기본 생성자");

    }

    @GetMapping(value = "board")
    public String hello(String name) { // localhost:9000/?name=홍길동
        return "안녕하세요. " + name + "님";
    }
}
