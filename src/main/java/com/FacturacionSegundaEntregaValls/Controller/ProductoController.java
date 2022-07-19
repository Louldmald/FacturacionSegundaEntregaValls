package com.FacturacionSegundaEntregaValls.Controller;

import com.FacturacionSegundaEntregaValls.Model.Cliente;
import com.FacturacionSegundaEntregaValls.Model.Producto;
import com.FacturacionSegundaEntregaValls.Service.ProductoService;
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
    public List<Producto> obtenerProductos() {
        return ProductoService.buscarTodosP();
    }

    @GetMapping("/{codigoProducto}")
    public Producto buscarProductoPorCodigo(@PathVariable Integer codigoProducto) {
        return ProductoService.buscarPorCodigo(codigoProducto);
    }

    @PostMapping("/actualizar")
    public Cliente actualizarProducto(@RequestBody Producto producto) throws Exception {
        return ProductoService.actualizarP(producto);
    }

    @PostMapping("/crear")
    public Cliente crearProducto(@RequestBody Producto producto) throws Exception {
        return ProductoService.crearP(producto);
    }

}
