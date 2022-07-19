package com.FacturacionSegundaEntregaValls.Service;

import com.FacturacionSegundaEntregaValls.DAO.ClienteDAO;
import com.FacturacionSegundaEntregaValls.Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    public Cliente buscarPorDni(Integer dni) {
        return clienteDAO.findById(dni).orElse(null);
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clienteDAO.findAll();
    }

    @Override
    public Cliente crear(Cliente cliente) throws Exception {
        if (buscarPorDni(cliente.getDni()) == null) {
            return clienteDAO.save(cliente);
        } else {
            throw new Exception("Cliente ya existe");
        }
    }

    @Override
    public Cliente actualizar(Cliente cliente) throws Exception {
        if (buscarPorDni(cliente.getDni()) != null) {
            return clienteDAO.save(cliente);
        } else {
            throw new Exception("Cliente no existe");
        }
    }
}
