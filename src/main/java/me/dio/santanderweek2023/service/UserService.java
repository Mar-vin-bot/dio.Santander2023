package me.dio.santanderweek2023.service;

import me.dio.santanderweek2023.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create (User user);

}
