package com.educandoweb.coursespringboot.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursespringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
