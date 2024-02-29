/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.domain.repository;

import java.util.List;
import java.util.Optional;

import com.platzi.cursospring.ejerciciomarket.domain.Purchase;

/**
 * @author ASUS
 *
 */
public interface PurchaseRepository {
	
	List<Purchase> getAll();
	
	Optional<List<Purchase>> getByClient(String clientId);
	
	Purchase save(Purchase purchase);

}
