package com.FacturacionSegundaEntregaValls.Controller;

import com.FacturacionSegundaEntregaValls.Model.Cliente;
import com.FacturacionSegundaEntregaValls.Service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteService;

    @GetMapping("/all")
    public List<Cliente> obtenerClientes() {
        return clienteService.buscarTodos();
    }

    @GetMapping("/{dni}")
    public Cliente buscarClientePorDni(@PathVariable Integer dni) {
        return clienteService.buscarPorDni(dni);
    }

    @PostMapping("/actualizar")
    public Cliente actualizarCliente(@RequestBody Cliente cliente) throws Exception {
        return clienteService.actualizar(cliente);
    }

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) throws Exception {
        return clienteService.crear(cliente);
    }

}
