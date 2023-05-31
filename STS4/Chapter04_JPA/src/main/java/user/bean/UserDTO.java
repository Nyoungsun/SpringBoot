package user.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "usertable")
@Data
@Entity
public class UserDTO {
	
	@Column(nullable = false, length = 30)
	private String name;
	@Id
	@Column(nullable = false, length = 30, unique = true)
	private String id;
	@Column(nullable = false, length = 30)
	private String pwd;
}
