/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.platzi.cursospring.ejerciciomarket.domain.Category;
import com.platzi.cursospring.ejerciciomarket.domain.Product;
import com.platzi.cursospring.ejerciciomarket.domain.repository.ProductRepository;
import com.platzi.cursospring.ejerciciomarket.persistence.crud.ProductoCrudRepository;
import com.platzi.cursospring.ejerciciomarket.persistence.entity.Categoria;
import com.platzi.cursospring.ejerciciomarket.persistence.entity.Producto;
import com.platzi.cursospring.ejerciciomarket.persistence.mapper.CategoryMapper;
import com.platzi.cursospring.ejerciciomarket.persistence.mapper.ProductMapper;


/**
 * @author ASUS
 *
 */
@Repository
public class ProductoRepositoryImpl implements ProductRepository{
	@Autowired
	private ProductoCrudRepository productoCrudRepository;
	
	@Autowired
	private ProductMapper mapper;
	
	@Autowired
	private CategoryMapper mapperCategory;

	@Override
	public List<Product> getAll(){
		List<Producto> listProductos = (List<Producto>) this.productoCrudRepository.findAll(); 
		return mapper.toListProducts(listProductos);
	}

	@Override
	public List<Product> getByIdCategory(int categoryId) {
		List<Producto> listaProductos = this.productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
		return mapper.toListProducts(listaProductos);
	}

	@Override
	public List<Product> getScarseProduct(int quantity) {
		List<Producto> listaProductos = this.productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity, true);
		//return Optional.of(mapper.toProducts(listaProductos.get()));
		return mapper.toListProducts(listaProductos);
	}

	@Override
	public Product getProduct(int productId) {
		Producto producto = this.productoCrudRepository.findById(productId).get();
		//return Optional.of(mapper.toProduct(producto.get()));
		return mapper.toProduct(producto);
	}

	@Override
	public Product save(Product product) {
		Producto producto = this.productoCrudRepository.save(mapper.toProducto(product));
		return mapper.toProduct(producto);
	}

	@Override
	public void deleteProduct(int productId) {
		this.productoCrudRepository.deleteById(productId);
	}

}
