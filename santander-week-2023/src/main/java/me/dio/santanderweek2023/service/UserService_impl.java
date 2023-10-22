package me.dio.santanderweek2023.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.santanderweek2023.domain.model.User;
import me.dio.santanderweek2023.repository.UserRepository;

@Service
public class UserService_impl implements UserService {

	@Autowired
	private UserRepository repo;
	
	
	@Override
	public User findById(Long id) {
		return repo.findById(id).orElseThrow(NoSuchElementException:: new);
	}

	@Override
	public User create(User user) {
		if(user.getId() != null && repo.existsByAccountNumber(user.getAccount().getNumber())){
			throw new IllegalArgumentException("User ja existe");
		}
		return repo.save(user);
	}

}
