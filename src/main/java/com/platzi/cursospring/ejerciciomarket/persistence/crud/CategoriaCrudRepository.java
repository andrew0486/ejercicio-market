/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.platzi.cursospring.ejerciciomarket.persistence.entity.Categoria;

/**
 * @author ASUS
 *
 */
public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer>{
	List<Categoria> findByIdCategoriaOrderByDescripcion(Integer idCategoria);
	List<Categoria> findByEstadoOrderByDescripcion(boolean estado);
}
