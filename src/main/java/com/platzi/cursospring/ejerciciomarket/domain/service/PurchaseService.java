/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platzi.cursospring.ejerciciomarket.domain.Purchase;
import com.platzi.cursospring.ejerciciomarket.domain.repository.PurchaseRepository;
import com.platzi.cursospring.ejerciciomarket.persistence.entity.Compra;

/**
 * @author ASUS
 *
 */
@Service
public class PurchaseService {

	@Autowired
	private PurchaseRepository purchaseRepository;
	
	public List<Purchase> getAll() {
		return this.purchaseRepository.getAll();
	}

	public Optional<List<Purchase>> getByClient(String clientId) {
		return this.purchaseRepository.getByClient(clientId);
	}

	public Purchase save(Purchase purchase) {
		return this.purchaseRepository.save(purchase); 
	} 

}
