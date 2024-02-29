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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "compras")
public class Compra implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_compra")
    private Integer idCompra;
    
    @Column(name = "id_cliente")
    private String idCliente;
    
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecha;
    
    @Column(name = "medio_pago")
    private String medioPago;
    
    @Column(name = "comentario")
    private String comentario;
    
    @Column(name = "estado")
    private String estado;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compra")
    private Collection<ComprasProducto> listComprasProducto;
    
    @JoinColumn(name = "id_cliente", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cliente cliente;

    public Compra() {
    }

    

	/**
	 * @return the idCompra
	 */
	public Integer getIdCompra() {
		return idCompra;
	}



	/**
	 * @param idCompra the idCompra to set
	 */
	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}



	/**
	 * @return the idCliente
	 */
	public String getIdCliente() {
		return idCliente;
	}



	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}



	/**
	 * @return the fecha
	 */
	public LocalDateTime getFecha() {
		return fecha;
	}



	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}



	/**
	 * @return the medioPago
	 */
	public String getMedioPago() {
		return medioPago;
	}



	/**
	 * @param medioPago the medioPago to set
	 */
	public void setMedioPago(String medioPago) {
		this.medioPago = medioPago;
	}



	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}



	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}



	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}



	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
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
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}



	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	@Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompra != null ? idCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compra)) {
            return false;
        }
        Compra other = (Compra) object;
        if ((this.idCompra == null && other.idCompra != null) || (this.idCompra != null && !this.idCompra.equals(other.idCompra))) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "Compra [idCompra=" + idCompra + ", fecha=" + fecha + ", medioPago=" + medioPago + ", comentario="
				+ comentario + ", estado=" + estado + ", comprasProductosCollection=" + listComprasProducto
				+ ", idCliente=" + cliente.toString() + "]";
	}

    
    
}
