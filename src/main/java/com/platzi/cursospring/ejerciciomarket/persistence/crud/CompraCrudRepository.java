/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.platzi.cursospring.ejerciciomarket.persistence.entity.Compra;

/**
 * @author ASUS
 *
 */
public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
	
	Optional<List<Compra>> getByIdClienteOrderByIdCompra(String idCliente);

}
