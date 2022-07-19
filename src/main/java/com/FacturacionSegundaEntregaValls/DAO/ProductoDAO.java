package com.FacturacionSegundaEntregaValls.DAO;

import com.FacturacionSegundaEntregaValls.Model.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDAO extends JpaRepository<ProductoModel, Integer> {
}
