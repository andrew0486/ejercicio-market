/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.platzi.cursospring.ejerciciomarket.persistence.entity.ComprasProducto;
import com.platzi.cursospring.ejerciciomarket.persistence.entity.ComprasProductoPK;

/**
 * @author ASUS
 *
 */
public interface ComprasProductoCrudRepository extends CrudRepository<ComprasProducto, ComprasProductoPK> {

}
