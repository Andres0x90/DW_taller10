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
public class DJ 
{
    private String id_dj,edad,descripcion,votos;
    private Lugar lugar;
    private ArrayList<Concierto> conciertos;

    public DJ(String id_dj, String edad, String descripcion, String votos, Lugar lugar) {
        this.id_dj = id_dj;
        this.edad = edad;
        this.descripcion = descripcion;
        this.votos = votos;
        this.lugar = lugar;
    }

    public String getId_dj() {
        return id_dj;
    }

    public void setId_dj(String id_dj) {
        this.id_dj = id_dj;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVotos() {
        return votos;
    }

    public void setVotos(String votos) {
        this.votos = votos;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
    
}
