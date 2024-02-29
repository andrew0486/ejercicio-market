/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.cursospring.ejerciciomarket.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "compras_productos")
public class ComprasProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected ComprasProductoPK comprasProductoPK;
    
    @Column(name = "cantidad")
    private Integer cantidad;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total")
    private BigDecimal total;
    
    @Column(name = "estado")
    private Boolean estado;
    
    @JoinColumn(name = "id_compra", referencedColumnName = "id_compra", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    @MapsId("idCompra")
    private Compra compra;
    
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;

    public ComprasProducto() {
    }

    public ComprasProducto(ComprasProductoPK comprasProductosPK) {
        this.comprasProductoPK = comprasProductosPK;
    }

    public ComprasProducto(int idCompra, int idProducto) {
        this.comprasProductoPK = new ComprasProductoPK(idCompra, idProducto);
    }

	/**
	 * @return the comprasProductoPK
	 */
	public ComprasProductoPK getComprasProductoPK() {
		return comprasProductoPK;
	}

	/**
	 * @param comprasProductoPK the comprasProductoPK to set
	 */
	public void setComprasProductoPK(ComprasProductoPK comprasProductoPK) {
		this.comprasProductoPK = comprasProductoPK;
	}

	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
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
	 * @return the compra
	 */
	public Compra getCompra() {
		return compra;
	}

	/**
	 * @param compra the compra to set
	 */
	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (comprasProductoPK != null ? comprasProductoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprasProducto)) {
            return false;
        }
        ComprasProducto other = (ComprasProducto) object;
        if ((this.comprasProductoPK == null && other.comprasProductoPK != null) || (this.comprasProductoPK != null && !this.comprasProductoPK.equals(other.comprasProductoPK))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "ComprasProducto [comprasProductoPK=" + comprasProductoPK + ", cantidad=" + cantidad + ", total=" + total
				+ ", estado=" + estado + ", compra=" + compra + ", producto=" + producto + "]";
	}

    
    
}
