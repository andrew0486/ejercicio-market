/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.platzi.cursospring.ejerciciomarket.domain.Category;
import com.platzi.cursospring.ejerciciomarket.persistence.entity.Categoria;

/**
 * @author ASUS
 *
 */
@Mapper(componentModel = "spring")
public interface CategoryMapper {
	@Mappings({
		@Mapping(source = "idCategoria", target = "categoryId"),
		@Mapping(source = "descripcion", target = "category"),
		@Mapping(source = "estado", target = "active")
	})
	Category toCategory(Categoria categoria);
	
	List<Category> toListCategories(List<Categoria> listCategorias);
	
	@Mapping(target = "listProductos", ignore = true)
	@InheritInverseConfiguration
	Categoria toCategoria(Category category);
	
}
