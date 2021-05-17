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
public interface DJDAO
{
    public void agregar(DJ d) throws Exception;
    public void modificar(DJ d) throws Exception;
    public void eliminar(DJ d) throws Exception;
    public ArrayList<DJ> obtenerTodos() throws Exception;
    public DJ obtenerPorId(Integer id) throws Exception;

}
