package com.FacturacionSegundaEntregaValls.Service;

import com.FacturacionSegundaEntregaValls.DAO.ClienteDAO;
import com.FacturacionSegundaEntregaValls.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    public List<Cliente> buscarTodos() {
        return this.clienteDAO.buscarTodos();
    }

    public Cliente save(Cliente cliente) {
        return this.clienteDAO.save(cliente);
    }

    public Cliente findById(Integer id) {

        var opCliente =  this.clienteDAO.findById(id);
        if (opCliente.isPresent()) {
            return opCliente.get();
        } else {
            return new Cliente();
        }
    }
}
