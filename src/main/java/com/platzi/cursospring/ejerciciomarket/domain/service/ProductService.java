/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platzi.cursospring.ejerciciomarket.domain.Category;
import com.platzi.cursospring.ejerciciomarket.domain.Product;
import com.platzi.cursospring.ejerciciomarket.domain.repository.ProductRepository;

/**
 * @author ASUS
 *
 */
@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAll() {
		return this.productRepository.getAll();
	}
	
	public List<Product> getByIdCategory(int categoryId) {
		return this.productRepository.getByIdCategory(categoryId);
	}
	
	public List<Product> getScarseProduct(int quantity) {
		return this.productRepository.getScarseProduct(quantity);
	}
	
	public Product getProduct(int productId) {
		return this.productRepository.getProduct(productId);
	}
	
	public Product saveProduct(Product product) {
		
		return this.productRepository.save(product);
	}
	
	public boolean deleteProduct(int productId) {
		boolean deleted = false;
		if (Optional.of(this.getProduct(productId)).isPresent()) {
			this.productRepository.deleteProduct(productId);
			deleted = true;
		} else {
			deleted = false;
		}
		return deleted;
	}

}
