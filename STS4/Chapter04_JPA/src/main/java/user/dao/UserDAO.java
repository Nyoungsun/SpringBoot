package user.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import user.bean.UserDTO;

@Repository
public interface UserDAO extends JpaRepository<UserDTO, String> {
	// 쿼리 메소드
	// select * from usertable where name like '%' || ? || '%'
	public List<UserDTO> findByNameContaining(String keyword);

	// select * from usertable where id like '%' || ? || '%'
	public List<UserDTO> findByIdContaining(String keyword);

	// @Query: 검색 대상이 테이블이 아니라 영속성 컨텍스트에 등록된 엔티티(DTO)이다.
	// select * from usertable where name like '%' || ? || '%'
	@Query("select userDTO from UserDTO userDTO where userDTO.name like '%' || :keyword || '%'")
	public List<UserDTO> searchName(String keyword);

	// select * from usertable where id like '%' || ? || '%'
	@Query("select userDTO from UserDTO userDTO where userDTO.id like '%' || :keyword || '%'")
	public List<UserDTO> searchId(String keyword);
}
