package me.dio.santanderweek2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.santanderweek2023.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	 boolean existsByAccountNumber(String accountNumber);

}
