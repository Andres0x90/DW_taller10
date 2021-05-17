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
public interface LugarDAO 
{
    public void agregar(Lugar l) throws Exception;
    public void modificar(Lugar l) throws Exception;
    public void eliminar(Lugar l) throws Exception;
    public ArrayList<Lugar> obtenerTodos() throws Exception;
    public Lugar obtenerPorId(Integer id) throws Exception;
}
