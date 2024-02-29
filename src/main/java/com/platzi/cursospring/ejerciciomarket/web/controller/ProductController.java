/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.cursospring.ejerciciomarket.domain.Product;
import com.platzi.cursospring.ejerciciomarket.domain.service.ProductService;

/**
 * @author ASUS
 *
 */
@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(path = "/getAllProducts")
	public ResponseEntity<List<Product>> getAll() {
		List<Product> listproducts = this.productService.getAll();
		ResponseEntity<List<Product>> response = null;
		if (listproducts != null && !listproducts.isEmpty()) {
			response = new ResponseEntity<>(listproducts, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	@GetMapping(path = "/getProductsByIdCategory/{categoryId}")
	public ResponseEntity<List<Product>> getProductsByIdCategory(@PathVariable("categoryId") int categoryId) {
		List<Product> listproducts = this.productService.getByIdCategory(categoryId);
		ResponseEntity<List<Product>> response = null;
		if (listproducts != null && !listproducts.isEmpty()) {
			response = new ResponseEntity<>(listproducts, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	@GetMapping(path = "getScarseProduct")
	public ResponseEntity<List<Product>> getScarseProduct(@RequestBody int quantity) {
		List<Product> listproducts = this.productService.getScarseProduct(quantity);
		ResponseEntity<List<Product>> response = null;
		if (listproducts != null && !listproducts.isEmpty()) {
			response = new ResponseEntity<>(listproducts, HttpStatus.OK);
		} else {
			response = new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	@GetMapping("/getProduct/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable("productId") int productId) {
		Product product = this.productService.getProduct(productId);
		ResponseEntity<Product> response = null;
		if (product != null) {
			response = new ResponseEntity<Product>(product, HttpStatus.OK);			
		} else {
			response = new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		return response;
	}

	@PostMapping("/saveProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		
		return new ResponseEntity<Product>(this.productService.saveProduct(product), HttpStatus.CREATED);
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping(path = "/deleteProduct/{productId}")
	public ResponseEntity deleteProduct(@PathVariable("productId") int productId) {
		ResponseEntity response = null;
		if (this.productService.deleteProduct(productId)) {
			response = new ResponseEntity(HttpStatus.OK);
		} else {
			response = new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return response;
	}
}
