/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sw2.dao;

import com.sw2.bean.Usuario;
import com.sw2.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Diego
 */
public class UsuarioDAO {

    Conexion cone = new Conexion();

    public Usuario obtenerUserXUsuario(String usu) {

        Usuario usuario = null;
        int idusuario = 0;
        String nombre = "";
        String contra = "";
        String apellido = "";
        String correo = "";
        String sexo = "";
        String tipo = "";
        String fecha_nac = "";
        String password = "";
        ResultSet rs = null;

        Connection con = null;
        String sql = "SELECT * FROM usuarios WHERE correo=? ";
        PreparedStatement stmt = null;
        System.out.println(sql);

        try {
            con = cone.getConnection();
            stmt = con.prepareStatement(sql);

            stmt.setString(1, usu);

            rs = stmt.executeQuery();

            while (rs.next()) {
                usuario = new Usuario();
                idusuario = rs.getInt(1);
                usuario.setIdusuarios(idusuario);
                nombre = rs.getString(2);
                usuario.setNombre(nombre);
                apellido = rs.getString(3);
                usuario.setApellido(apellido);
                correo = rs.getString(4);
                usuario.setCorreo(correo);
                sexo = rs.getString(5);
                usuario.setSexo(sexo);
                tipo = rs.getString(6);
                usuario.setTipo(tipo);
                fecha_nac = rs.getString(7);
                usuario.setFecha_nac(fecha_nac);
                contra = rs.getString(8);
                usuario.setPassword(contra);
            }

        } catch (SQLException ex) {
            System.out.println("Ocurrio un error SQL ");
            ex.printStackTrace();
        } finally {
            try {

                rs.close();
                stmt.close();
                con.close();
            } catch (SQLException ex) {

            }
        }

        return usuario;
    }

    
     public void crearUsuario(Usuario usuario) {
        Connection con = cone.getConnection();
        PreparedStatement stmt1 = null;

        String sql1 = "INSERT INTO usuarios ( idusuarios , nombre, apellido , correo ,sexo , tipo, fecha_nac, password "
               + " ) VALUES (?,?,?,?,?,?,?,?)";

        // Obtener la conexion
        try {

            stmt1 = con.prepareStatement(sql1);

            stmt1.setInt(1, usuario.getIdusuarios());
            stmt1.setString(2, usuario.getNombre());
            stmt1.setString(3, usuario.getApellido());
            stmt1.setString(4, usuario.getCorreo());
            stmt1.setString(5, usuario.getSexo());
            stmt1.setString(6, usuario.getTipo());
            stmt1.setString(7, usuario.getFecha_nac());
            stmt1.setString(8, usuario.getPassword());
       

            int rc1 = stmt1.executeUpdate();
            

        } catch (SQLException ex) {
            System.out.println("Ocurrio un error SQL ");
            ex.printStackTrace();
        } finally {
            try {
                stmt1.close();

                con.close();
            } catch (SQLException ex) {

            }
        }

    }
}
