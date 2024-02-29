/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.domain.repository;

import java.util.List;

import com.platzi.cursospring.ejerciciomarket.domain.Category;
import com.platzi.cursospring.ejerciciomarket.domain.Product;
import com.platzi.cursospring.ejerciciomarket.persistence.entity.Categoria;

/**
 * @author ASUS
 *
 */
public interface ProductRepository {
	
	List<Product> getAll();
	List<Product> getByIdCategory(int categoryId);
	List<Product> getScarseProduct(int quantity);
	Product getProduct(int productId);
	Product save(Product product);
	void deleteProduct(int productId);
}
