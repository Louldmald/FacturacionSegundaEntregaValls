package com.FacturacionSegundaEntregaValls.Service;


import com.FacturacionSegundaEntregaValls.Model.ProductoModel;

import java.util.List;

public interface ProductoService {


    ProductoModel buscarPorCodigo(Integer codigoProducto);
    List<ProductoModel> buscarTodosP();
    ProductoModel crearP(ProductoModel productoModel) throws Exception;
    ProductoModel actualizarP(ProductoModel productoModel) throws Exception;
}
