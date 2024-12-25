package com.dscode.ebicart;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dscode.ebicart.models.Product;
import com.dscode.ebicart.repositories.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner {
	
	
	@Autowired
	private ProductRepository productRepository;
	@Override
	public void run(String...args) throws Exception{
		//Check if the table is empty
		if(productRepository.count()== 0) {
			//Seed demo data
			List<Product> products = Arrays.asList(
					new Product("OPPO F12S Pro 5G", 245.67,"OPPO F12s Pro 5G is a powerfull device with a RAM Extension features, that offeres brilliant operational speed to users.",4.5, "Mobile Phone", "Amazon", 5,15),
					new Product("MOTO F12S Pro 5G", 245.67,"OPPO F12s Pro 5G is a powerfull device with a RAM Extension features, that offeres brilliant operational speed to users.",4.5, "Mobile Phone", "Amazon", 5,15),
					new Product("REALME F12S Pro 5G", 245.67,"OPPO F12s Pro 5G is a powerfull device with a RAM Extension features, that offeres brilliant operational speed to users.",4.5, "Mobile Phone", "Amazon", 5,15),
					new Product("POCO F12S Pro 5G", 245.67,"OPPO F12s Pro 5G is a powerfull device with a RAM Extension features, that offeres brilliant operational speed to users.",4.5, "Mobile Phone", "Amazon", 5,15),
					new Product("SAMSUNG F12S Pro 5G", 245.67,"OPPO F12s Pro 5G is a powerfull device with a RAM Extension features, that offeres brilliant operational speed to users.",4.5, "Mobile Phone", "Amazon", 5,15),
					new Product("IPHONE F12S Pro 5G", 245.67,"OPPO F12s Pro 5G is a powerfull device with a RAM Extension features, that offeres brilliant operational speed to users.",4.5, "Mobile Phone", "Amazon", 5,15),
					new Product("ONEPLUS F12S Pro 5G", 245.67,"OPPO F12s Pro 5G is a powerfull device with a RAM Extension features, that offeres brilliant operational speed to users.",4.5, "Mobile Phone", "Amazon", 5,15)
					
					);
			
			productRepository.saveAll(products);
			System.out.println("Demo Data Seeded");
		}
		
	}

}
