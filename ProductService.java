package com.dscode.ebicart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dscode.ebicart.models.Product;
import com.dscode.ebicart.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository ProductRepository;
	 
	public List<Product> getAllProducts() {
		return  ProductRepository.findAll();
	}

}
