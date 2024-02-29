/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence.crud;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.platzi.cursospring.ejerciciomarket.persistence.entity.Producto;

/**
 * Repositorio para la entidad producto
 * @author ASUS
 *
 */
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
	
	List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
	List<Producto> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
