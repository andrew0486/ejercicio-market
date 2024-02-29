/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.platzi.cursospring.ejerciciomarket.domain.Purchase;
import com.platzi.cursospring.ejerciciomarket.domain.repository.PurchaseRepository;
import com.platzi.cursospring.ejerciciomarket.persistence.crud.CompraCrudRepository;
import com.platzi.cursospring.ejerciciomarket.persistence.entity.Compra;
import com.platzi.cursospring.ejerciciomarket.persistence.mapper.PurchaseMapper;

/**
 * @author ASUS
 *
 */
@Repository
public class CompraRepository implements PurchaseRepository {
	
	@Autowired
	private CompraCrudRepository compraCrudRepository;
	
	@Autowired
	private PurchaseMapper mapper;

	/**
	 * 
	 */
	public CompraRepository() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Purchase> getAll() {
		return this.mapper.toListPurchases((List<Compra>) this.compraCrudRepository.findAll());
	}

	@Override
	public Optional<List<Purchase>> getByClient(String clientId) {
		return this.compraCrudRepository.getByIdClienteOrderByIdCompra(clientId).
				map(compras -> this.mapper.toListPurchases(compras));
	}

	@Override
	public Purchase save(Purchase purchase) {
		Compra compra = this.mapper.toCompra(purchase);
		compra.getListComprasProducto().forEach(producto -> producto.setCompra(compra));
		return mapper.toPurchase(this.compraCrudRepository.save(compra));
	}

}
