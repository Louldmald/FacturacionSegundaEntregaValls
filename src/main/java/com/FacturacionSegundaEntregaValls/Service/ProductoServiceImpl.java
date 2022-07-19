package com.FacturacionSegundaEntregaValls.Service;

import com.FacturacionSegundaEntregaValls.DAO.ProductoDAO;
import com.FacturacionSegundaEntregaValls.Model.ProductoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDAO productoDAO;

    @Override
    public ProductoModel buscarPorCodigo(Integer codigoProducto) {
        return productoDAO.findById(codigoProducto).orElse(null);
    }

    @Override
    public List<ProductoModel> buscarTodosP() {
        return productoDAO.findAll();
    }

    @Override
    public ProductoModel crearP(ProductoModel productoModel) throws Exception {
        if (buscarPorCodigo(productoModel.getCodigoProducto()) == null) {
            return productoDAO.save(productoModel);
        } else {
            throw new Exception("Producto ya existe");
        }
    }

    @Override
    public ProductoModel actualizarP(ProductoModel productoModel) throws Exception {
        if (buscarPorCodigo(productoModel.getCodigoProducto()) != null) {
            return productoDAO.save(productoModel);
        } else {
            throw new Exception("Producto no existe");
        }
    }
}
