package com.example.demo;

import java.sql.Timestamp;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "BOARD_SEQ_GEN", sequenceName = "BOARD_SEQ", initialValue = 1, allocationSize = 1)
@Table(name = "board") // 하나의 DB Table로 인식 → create table 필요X
public class BoardDTO {

	@Id // 반드시 primary key 존재해야함
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOARD_SEQ_GEN")
	private int seq;
	@Column(name = "id", nullable = false, length = 30, unique = true)
	private String id; // varchar(30)
	@Column(nullable = false, length = 30)
	private String name;
	@Column(nullable = false, length = 30)
	private String subject;
	@Column
	private String content;
	@CreationTimestamp // 엔터티가 생성되는 시점의 시간을 등록
	private Timestamp logtime;
}
