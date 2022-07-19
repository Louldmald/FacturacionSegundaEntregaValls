package com.FacturacionSegundaEntregaValls.DAO;

import com.FacturacionSegundaEntregaValls.Model.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprobanteDAO extends JpaRepository<Comprobante, Integer> {
}
