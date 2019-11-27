package com.learning.userdemoservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.learning.userdemoservice.bean.User;
import com.learning.userdemoservice.bean.UserException;

@Component
public class UserDaoService {
	private static List<User> users = new ArrayList<User>();
	private static int counter = 0;
	static {
		users.add(new User(1, "shree ganesh", new Date()));
		users.add(new User(2, "shree ram", new Date()));
		users.add(new User(3, "hanuman", new Date()));
		users.add(new User(4, "kanishk", new Date()));
		counter = users.size();
	}
	//same function for create and udpate
	public User save(User user) {
		//create case , other than update case
		if(user.getId() == null) {
			users.add(new User(++counter, user.getName(), new Date()));
			user.setId(counter);
		}else {
			users.add(new User(user.getId(), user.getName(), new Date()));
		}
		return user;
	}
	
	public User fetchUser(String name) {
		return users.stream().filter(user -> user.getName().equals(name))
				.findFirst()
				.orElseThrow(() -> new UserException("user " +name+ " not found"));
	}
	public List<User> fetAllUsers() {
		return users;
	}
}
