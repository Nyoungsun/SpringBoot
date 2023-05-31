package board.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BoardDTO {
    private int seq;
    private String name;
    private String subject;
    private String content;
    private Date logtime;


}
