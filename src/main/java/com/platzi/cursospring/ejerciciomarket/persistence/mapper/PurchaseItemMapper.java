/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.platzi.cursospring.ejerciciomarket.domain.PurchaseItem;
import com.platzi.cursospring.ejerciciomarket.persistence.entity.ComprasProducto;

/**
 * @author ASUS
 *
 */
@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {
	
	@Mappings({
		@Mapping(source = "comprasProductoPK.idProducto", target = "id"),
		@Mapping(source = "cantidad", target = "quantity"), 
		@Mapping(source = "total", target = "total"),
		@Mapping(source = "estado", target = "active")
	})
	PurchaseItem toPurchaseItem(ComprasProducto compraProducto);
	
	@Mappings({
		@Mapping(target = "compra", ignore = true),
		@Mapping(target = "producto", ignore = true),
		@Mapping(target = "comprasProductoPK.idCompra", ignore = true)
	})
	@InheritInverseConfiguration
	ComprasProducto toCompraProducto(PurchaseItem purchaseItem);

}
