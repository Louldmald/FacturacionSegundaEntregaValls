package com.FacturacionSegundaEntregaValls.Controller;

import com.FacturacionSegundaEntregaValls.Model.ProductoModel;
import com.FacturacionSegundaEntregaValls.Service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoServiceImpl productoService;

    @GetMapping("/all")
    public List<ProductoModel> obtenerProductos() {
        return productoService.buscarTodosP();
    }

    @GetMapping("/{codigoProducto}")
    public ProductoModel buscarProductoPorCodigo(@PathVariable Integer codigoProducto) {
        return productoService.buscarPorCodigo(codigoProducto);
    }

    @PostMapping("/actualizar")
    public ProductoModel actualizarProducto(@RequestBody ProductoModel productoModel) throws Exception {
        return productoService.actualizarP(productoModel);
    }

    @PostMapping("/crear")
    public ProductoModel crearProducto(@RequestBody ProductoModel productoModel) throws Exception {
        return productoService.crearP(productoModel);
    }

}
