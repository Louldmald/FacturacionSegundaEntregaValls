package com.FacturacionSegundaEntregaValls.Service;


import com.FacturacionSegundaEntregaValls.Model.Producto;

import java.util.List;

public interface ProductoService {


    Producto buscarPorCodigo(Integer codigoProducto);
    List<Producto> buscarTodosP();
    Producto crearP(Producto producto) throws Exception;
    Producto actualizarP(Producto producto) throws Exception;
}
