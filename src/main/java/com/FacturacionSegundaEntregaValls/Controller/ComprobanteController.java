package com.FacturacionSegundaEntregaValls.Controller;


import com.FacturacionSegundaEntregaValls.DAO.ComprobanteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comprobante")
public class ComprobanteController {

    @Autowired
    private ComprobanteDAO comprobanteService;

    @GetMapping
    public List<ComprobanteDTO> findAll() {
        return this.comprobanteService.findAll();
    }

    // Single item

    @GetMapping("/{id}")
    public ComprobanteDTO one(@PathVariable Integer id) {

        return this.comprobanteService.findById(id);
    }

    @PostMapping
    public ComprobanteDTO newEntity(@RequestBody Comprobante comprobante) {
        return this.comprobanteService.save(comprobante);
}
