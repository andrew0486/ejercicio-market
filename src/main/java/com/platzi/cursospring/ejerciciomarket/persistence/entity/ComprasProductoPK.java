/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.cursospring.ejerciciomarket.persistence.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author ASUS
 */
@Embeddable
public class ComprasProductoPK implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
    @Column(name = "id_compra")
    private int idCompra;
    
    @Basic(optional = false)
    @Column(name = "id_producto")
    private int idProducto;

    public ComprasProductoPK() {
    }

    public ComprasProductoPK(int idCompra, int idProducto) {
        this.idCompra = idCompra;
        this.idProducto = idProducto;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCompra;
        hash += (int) idProducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComprasProductoPK)) {
            return false;
        }
        ComprasProductoPK other = (ComprasProductoPK) object;
        if (this.idCompra != other.idCompra) {
            return false;
        }
        if (this.idProducto != other.idProducto) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "CompraProductoPK [idCompra=" + idCompra + ", idProducto=" + idProducto + "]";
	}

    
    
}
