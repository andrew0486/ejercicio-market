/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.platzi.cursospring.ejerciciomarket.domain.Category;
import com.platzi.cursospring.ejerciciomarket.domain.repository.CategoryRepository;
import com.platzi.cursospring.ejerciciomarket.persistence.crud.CategoriaCrudRepository;
import com.platzi.cursospring.ejerciciomarket.persistence.entity.Categoria;
import com.platzi.cursospring.ejerciciomarket.persistence.mapper.CategoryMapper;

/**
 * @author ASUS
 *
 */
@Repository
public class CategoriaRepositoryImpl implements CategoryRepository {

	@Autowired
	private CategoriaCrudRepository categoriaRepository;
	
	@Autowired
	private CategoryMapper mapper;


	@Override
	public Category findByCategoryId(int categoryId) {
		return mapper.toCategory((categoriaRepository.findById(categoryId)).get());
	}

	@Override
	public List<Category> findAllByCategoryId(int categoryId) {
		List<Categoria> listaCategorias = categoriaRepository.findByIdCategoriaOrderByDescripcion(categoryId);
		return mapper.toListCategories(listaCategorias);
	}

	@Override
	public List<Category> findByState(boolean state) {
		return mapper.toListCategories(this.categoriaRepository.findByEstadoOrderByDescripcion(state));
	}

	@Override
	public List<Category> findAll() {
		List<Categoria> listaCategorias = (List<Categoria>) this.categoriaRepository.findAll();
		return mapper.toListCategories(listaCategorias);
	}

	@Override
	public Category saveCategory(Category category) {
		Categoria categoria = this.categoriaRepository.save(mapper.toCategoria(category));
		return mapper.toCategory(categoria);
	}

	@Override
	public void deleteCategoryByCategoryId(int categoryId) {
		this.categoriaRepository.deleteById(categoryId);
	}

}
