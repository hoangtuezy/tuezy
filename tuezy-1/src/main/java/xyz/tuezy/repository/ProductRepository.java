package xyz.tuezy.repository;

import org.springframework.stereotype.Repository;

import xyz.tuezy.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	public Product findByName(String name);
}
