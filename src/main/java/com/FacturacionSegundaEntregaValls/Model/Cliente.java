package com.FacturacionSegundaEntregaValls.Model;

import javax.persistence.*;

@Entity
@Table(name="Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer clienteid;

    private String apellido;

    private Integer dni;

    private String nombre;

}
