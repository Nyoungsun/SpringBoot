package user.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public void write(UserDTO userDTO) {
		
		userDAO.save(userDTO); 
	}

	@Override
	public List<UserDTO> getUserList() {
		
		return userDAO.findAll();
	}
	
	@Override
	public Optional<UserDTO> getUser(String id) {
		
		return userDAO.findById(id);
	}

	@Override
	public String isExistId(String id) {
		Optional<UserDTO> userDTO =  userDAO.findById(id); //id가 없으면 Optional.empty가 리턴됨
		
		if(userDTO.isPresent()) {
			return "exist";
		} else {
			return "non_exist";
		}
	}

	//쿼리 메소드 사용
//	@Override
//	public List<UserDTO> search(Map<String, String> map) {
//		String searchOption = map.get("searchOption");
//		String keyword = map.get("keyword");
//		
//		if(searchOption.equals("name")) {
//			return userDAO.findByNameContaining(keyword);
//		} else {
//			return userDAO.findByIdContaining(keyword);
//		}
//	}
	
	//@Query 사용
	@Override
	public List<UserDTO> search(Map<String, String> map) {
		String searchOption = map.get("searchOption");
		String keyword = map.get("keyword");
		
		if(searchOption.equals("name")) {
			return userDAO.searchName(keyword);
		} else {
			return userDAO.searchId(keyword);
		}
	}

	@Override
	public void delete(String id) {
		
		userDAO.deleteById(id);
	}
	
	

	
}