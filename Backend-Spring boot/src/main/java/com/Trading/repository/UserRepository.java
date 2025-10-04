package com.Trading.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Trading.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
