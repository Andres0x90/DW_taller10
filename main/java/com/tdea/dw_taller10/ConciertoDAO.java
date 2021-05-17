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
public interface ConciertoDAO {
     public void agregar(Concierto c) throws Exception;
    public void modificar(Concierto c) throws Exception;
    public void eliminar(Concierto c) throws Exception;
    public ArrayList<Concierto> obtenerTodos() throws Exception;
    public Concierto obtenerPorId(Integer id) throws Exception;

    
}
