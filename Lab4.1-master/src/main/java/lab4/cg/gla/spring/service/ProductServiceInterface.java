package lab4.cg.gla.spring.service;

import java.util.List;

import lab4.cg.gla.spring.entity.Product;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<Product> reterive();

}
