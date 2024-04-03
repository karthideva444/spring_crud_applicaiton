package com.crudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapp.entity.Product;
import com.crudapp.repo.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
		
	}
	public List<Product> saveProducts(List <Product> products){
		return repository.saveAll(products);
	}
	public List<Product> getProducts(){
		return repository.findAll();
	}
	

}
