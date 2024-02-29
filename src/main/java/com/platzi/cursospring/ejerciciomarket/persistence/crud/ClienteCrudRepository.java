/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.platzi.cursospring.ejerciciomarket.persistence.entity.Cliente;

/**
 * @author ASUS
 *
 */
public interface ClienteCrudRepository extends CrudRepository<Cliente, String>{

}
