package lab4.cg.gla.spring.service;

import java.util.List;

import lab4.cg.gla.spring.entity.Product;
import lab4.cg.gla.spring.entity.ProductOld;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<ProductOld> reterive();
	public List<Product> reterivev1();

}
