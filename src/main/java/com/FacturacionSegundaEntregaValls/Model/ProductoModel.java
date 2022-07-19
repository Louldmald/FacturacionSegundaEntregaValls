package com.FacturacionSegundaEntregaValls.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Producto")
public class ProductoModel {

    @Column(name = "DescProducto")
    private String DescProducto;

    @Column(name = "Valor")
    private Double Valor;

    @Column(name = "Cantidad")
    private Integer Cantidad;

    @Column(name = "CodigoProducto")
    @Id
    private Integer CodigoProducto;

    public ProductoModel(String descProducto, Double valor, Integer cantidad, Integer codigoProducto) {
        DescProducto = descProducto;
        Valor = valor;
        Cantidad = cantidad;
        CodigoProducto = codigoProducto;
    }

    public ProductoModel() {
    }

    public String getDescProducto() {
        return DescProducto;
    }

    public void setDescProducto(String descProducto) {
        DescProducto = descProducto;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }

    public Integer getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        CodigoProducto = codigoProducto;
    }
}
