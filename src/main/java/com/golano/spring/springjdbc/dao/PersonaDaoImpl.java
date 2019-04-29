/*
 * Implementación Persona DAO
 * http://acodigo.blogspot.com/2017/03/spring-acceso-datos-con-jdbc.html
 */
package com.golano.spring.springjdbc.dao;

import com.golano.spring.springjdbc.model.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 29/04/2019
 * @author gaolanot
 */
@Repository //Indica que se debe crear un bean de esta clase y trabaja en la 
            //capa de acceso a datos
public class PersonaDaoImpl implements PersonaDao {
    private DataSource dataSource;
    //Inyección automática Bean DataSource (SpringConfiguration)
    @Autowired
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }
    //Método listar personas
    @Override
    public List<Persona> listarPersonas() {
        List<Persona> lista = new ArrayList<>();
        Connection conn = null;
        try{    
            conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from 23people.persona");
            while(rs.next()){
                Persona p = new Persona();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setApellido(rs.getString("apellido"));
                lista.add(p);
            }
        }catch (SQLException se){
            throw new RuntimeException(se);
        }finally{
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException se){
                    System.out. println("Error cierre conexión: "+se);
                }
            }
        }
        
        return lista;
    }
    
}
