package com.FacturacionSegundaEntregaValls.Service;

import com.FacturacionSegundaEntregaValls.DAO.ProductoDAO;
import com.FacturacionSegundaEntregaValls.Model.Cliente;
import com.FacturacionSegundaEntregaValls.Model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Override
    public Producto buscarPorCodigo(Integer codigoProducto) {
        return ProductoDAO.findById(codigoProducto).orElse(null);
    }

    @Override
    public List<Producto> buscarTodosP() {
        return ProductoDAO.findAll();
    }

    @Override
    public Producto crearP(Producto producto) throws Exception {
        if (buscarPorCodigo(Producto.getCodigoProducto()) == null) {
            return ProductoDAO.save(Producto);
        } else {
            throw new Exception("Producto ya existe");
        }
    }

    @Override
    public Producto actualizarP(Producto producto) throws Exception {
        if (buscarPorCodigo(Producto.getCodigoProducto()) != null) {
            return ProductoDAO.save(Producto);
        } else {
            throw new Exception("Producto no existe");
        }
    }
}
