package com.assignment.app.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query(value = "SELECT * FROM user where id= ?1", nativeQuery = true)
	public User getUser(Integer id);

}
