package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.User;

//public interface UserRepo extends CrudRepository <User, Integer>{
public interface UserRepo extends JpaRepository <User, Integer>{
	
	List<User> findByUsername(String UserName);
	
	@Query(" from User where username = ?1 order by username desc ")
	List<User> findByUsernameSorted(String UserName);

}
