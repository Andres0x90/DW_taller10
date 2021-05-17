/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdea.dw_taller10;

/**
 *
 * @author Andres
 */
public class Lugar 
{
    private String id_lugar, nombre, direccion, telefono, genero, tipo_escenario;

    public Lugar(String id_lugar, String nombre, String direccion, String telefono, String genero, String tipo_escenario) {
        this.id_lugar = id_lugar;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.genero = genero;
        this.tipo_escenario = tipo_escenario;
    }

    public String getId_lugar() {
        return id_lugar;
    }

    public void setId_lugar(String id_lugar) {
        this.id_lugar = id_lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo_escenario() {
        return tipo_escenario;
    }

    public void setTipo_escenario(String tipo_escenario) {
        this.tipo_escenario = tipo_escenario;
    }
    
    
}
