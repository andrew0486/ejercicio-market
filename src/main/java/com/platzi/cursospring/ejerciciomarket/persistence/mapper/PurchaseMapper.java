/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.platzi.cursospring.ejerciciomarket.domain.Purchase;
import com.platzi.cursospring.ejerciciomarket.persistence.entity.Compra;

/**
 * @author ASUS
 *
 */
@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {
	@Mappings({
		@Mapping(source = "idCompra", target = "id"),
		@Mapping(source = "idCliente", target = "clientId"),
		@Mapping(source = "fecha", target = "date"),
		@Mapping(source = "medioPago", target = "pymentMethod"),
		@Mapping(source = "comentario", target = "comment"),
		@Mapping(source = "estado", target = "state"),
		@Mapping(source = "listComprasProducto", target = "items")
	})
	Purchase toPurchase(Compra compra);
	
	List<Purchase> toListPurchases(List<Compra> listaCompras);
	
	@Mapping(target = "cliente", ignore = true)
	@InheritInverseConfiguration
	Compra toCompra(Purchase purchase);
}
