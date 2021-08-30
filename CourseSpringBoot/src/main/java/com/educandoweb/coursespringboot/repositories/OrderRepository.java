package com.educandoweb.coursespringboot.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursespringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
