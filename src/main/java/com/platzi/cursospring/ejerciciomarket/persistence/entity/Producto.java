/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.cursospring.ejerciciomarket.persistence.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = true)
    @Column(name = "id_producto")
    private Integer idProducto;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "id_categoria")
    private Integer idCategoria;
    
    @Column(name = "codigo_barras")
    private String codigoBarra;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio_venta")
    private BigDecimal precioVenta;
    
    @Basic(optional = false)
    @Column(name = "cantidad_stock")
    private Integer cantidadStock;
    
    @Column(name = "estado")
    private Boolean estado;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private Collection<ComprasProducto> listComprasProducto;
    
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Categoria categoria;

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Integer idProducto, int cantidadStock) {
        this.idProducto = idProducto;
        this.cantidadStock = cantidadStock;
    }

	/**
	 * @return the idProducto
	 */
	public Integer getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the idCategoria
	 */
	public Integer getIdCategoria() {
		return idCategoria;
	}

	/**
	 * @param idCategoria the idCategoria to set
	 */
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	/**
	 * @return the codigoBarra
	 */
	public String getCodigoBarra() {
		return codigoBarra;
	}

	/**
	 * @param codigoBarra the codigoBarra to set
	 */
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	/**
	 * @return the precioVenta
	 */
	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return the cantidadStock
	 */
	public Integer getCantidadStock() {
		return cantidadStock;
	}

	/**
	 * @param cantidadStock the cantidadStock to set
	 */
	public void setCantidadStock(Integer cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	/**
	 * @return the estado
	 */
	public Boolean getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	/**
	 * @return the listComprasProducto
	 */
	public Collection<ComprasProducto> getListComprasProducto() {
		return listComprasProducto;
	}

	/**
	 * @param listComprasProducto the listComprasProducto to set
	 */
	public void setListComprasProducto(Collection<ComprasProducto> listComprasProducto) {
		this.listComprasProducto = listComprasProducto;
	}

	/**
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "Productos [idProducto=" + idProducto + ", nombre=" + nombre + ", codigoBarras=" + codigoBarra
				+ ", precioVenta=" + precioVenta + ", cantidadStock=" + cantidadStock + ", estado=" + estado
				+ ", comprasProductosCollection=" + listComprasProducto + ", idCategoria=" + idCategoria + "]";
	}

    
    
}
