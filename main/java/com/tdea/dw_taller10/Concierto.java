/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tdea.dw_taller10;

import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Concierto {
    private String nombre, descripcion,fecha;
    Lugar lugar;
    ArrayList<DJ> djs;

    public Concierto(String nombre, String descripcion, String fecha, Lugar lugar) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
    
    
    
}
