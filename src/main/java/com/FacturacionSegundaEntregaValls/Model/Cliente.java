package com.FacturacionSegundaEntregaValls.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Cliente")
public class Cliente {

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "DNI")
    @Id
    private Integer dni;

    //Constructor
    public Cliente(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    //Constructor Vacio
    public Cliente() {
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {return dni;}

    public void setDni(Integer dni) {this.dni = dni;}

}

