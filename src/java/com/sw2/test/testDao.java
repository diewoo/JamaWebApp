/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sw2.test;

import com.sw2.bean.Usuario;
import com.sw2.dao.UsuarioDAO;

/**
 *
 * @author Diego
 */
public class testDao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario=new Usuario();
        UsuarioDAO test=new UsuarioDAO();
      usuario=  test.obtenerUserXUsuario("dgo250594@gmail.com");
        System.out.println(usuario);
        
    }
    
}
