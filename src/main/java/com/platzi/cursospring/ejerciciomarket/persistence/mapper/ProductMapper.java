/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.platzi.cursospring.ejerciciomarket.domain.Product;
import com.platzi.cursospring.ejerciciomarket.persistence.entity.Producto;

/**
 * @author ASUS
 *
 */
@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

	@Mappings({
		@Mapping(source = "idProducto", target = "productId"),
		@Mapping(source = "nombre", target = "name"),
		@Mapping(source = "idCategoria", target = "categoryId"),
		@Mapping(source = "precioVenta", target = "price"),
		@Mapping(source = "cantidadStock", target = "stock"),
		@Mapping(source = "estado", target = "active"),
		@Mapping(source = "categoria", target = "category")
	})
	Product toProduct(Producto producto);

	List<Product> toListProducts(List<Producto> listaProductos);

	
	@Mapping(target = "codigoBarra", ignore = true)
	@InheritInverseConfiguration	
	Producto toProducto(Product product);

}
