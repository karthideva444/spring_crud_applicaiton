package com.crudapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapp.entity.Product; 

public interface ProductRepository extends JpaRepository<Product,Interger>{
	

	
}
