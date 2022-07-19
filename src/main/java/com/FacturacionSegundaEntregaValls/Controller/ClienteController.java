package com.FacturacionSegundaEntregaValls.Controller;

import com.FacturacionSegundaEntregaValls.Model.Cliente;
import com.FacturacionSegundaEntregaValls.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> BuscarTodos() {
        return this.clienteService.BuscarTodos();
    }

    // Single item

    @GetMapping("/{id}")
    public Cliente one(@PathVariable Integer id) {

        return this.clienteService.findById(id);
    }

    @PostMapping
    public Cliente nuevoCliente(@RequestBody Cliente cliente) {
        return this.clienteService.save(cliente);
    }

}
