/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.domain.repository;

import java.util.List;

import com.platzi.cursospring.ejerciciomarket.domain.Category;

/**
 * @author ASUS
 *
 */
public interface CategoryRepository {
	Category findByCategoryId(int categoryId);
	List<Category> findAllByCategoryId(int categoryId);
	List<Category> findByState(boolean state);
	List<Category> findAll();
	Category saveCategory(Category category);
	void deleteCategoryByCategoryId(int categoryId);
}
