package com.dscode.ebicart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dscode.ebicart.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
