package com.huatek.InterviewManager.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huatek.InterviewManager.accessingdatamysql.UserRepository;
import com.huatek.InterviewManager.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public boolean addNewUser(String name, String email) {
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return true;
	}

	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
}
