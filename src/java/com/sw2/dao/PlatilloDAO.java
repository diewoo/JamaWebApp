/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sw2.dao;

import com.sw2.bean.Platillo;
import com.sw2.conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class PlatilloDAO {
    
    Conexion conn = new Conexion();

    public List<Platillo> obtenerPlatillo(int  pk_usu) {
        List<Platillo> platillos = new ArrayList();;
        Platillo platillo = null;

        ResultSet rs = null;

        Connection con = null;
        String sql = "select p.idplatillo , p.nombre , p.descripcion, p.imagen ,p.tipo , p.tag \n"
                + "from jamadatabase.usuarioxplatillo u inner join jamadatabase.platillo p on u.idplatillo =p.idplatillo\n"
                + "where u.idusuarios = ?";
        PreparedStatement stmt = null;
        System.out.println(sql);

        try {
            con = conn.getConnection();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, pk_usu);
            rs = stmt.executeQuery();

            while (rs.next()) {
                
                platillo = new Platillo();
                platillo.setId(rs.getInt(1));
                platillo.setNombre(rs.getString(2));
                platillo.setDescripcion(rs.getString(3));
                platillo.setImagen(rs.getString(4));
                platillo.setTipo(rs.getString(5));
                platillo.setTag(rs.getString(6));
                platillos.add(platillo);
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
        return platillos;
    }

}
