package com.FacturacionSegundaEntregaValls.Service;

import com.FacturacionSegundaEntregaValls.Model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente buscarPorDni(Integer dni);
    List<Cliente> buscarTodos();
    Cliente crear(Cliente cliente) throws Exception;
    Cliente actualizar(Cliente cliente) throws Exception;
}
