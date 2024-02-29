/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.cursospring.ejerciciomarket.domain.Purchase;
import com.platzi.cursospring.ejerciciomarket.domain.service.PurchaseService;

/**
 * @author ASUS
 *
 */
@RestController
@RequestMapping("/purchase")
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Purchase>> getAll() {
		return new ResponseEntity<List<Purchase>>(this.purchaseService.getAll(), HttpStatus.OK);
	}

	@GetMapping("/client/{clientId}")
	public ResponseEntity<List<Purchase>> getByClient(@PathVariable("clientId") String clientId) {
		return this.purchaseService.getByClient(clientId).map(purchases -> new ResponseEntity<>(purchases, HttpStatus.OK)).
				orElse(new ResponseEntity<List<Purchase>>(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/save")
	public ResponseEntity<Purchase> save(Purchase purchase) {
		return new ResponseEntity<Purchase>(this.purchaseService.save(purchase), HttpStatus.CREATED);
	}

}
