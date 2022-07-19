package com.FacturacionSegundaEntregaValls.DAO;

import com.FacturacionSegundaEntregaValls.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {
}
