/*
 * Interfaz para la clase y modelo Persona
 * http://acodigo.blogspot.com/2017/03/spring-acceso-datos-con-jdbc.html
 */
package com.golano.spring.springjdbc.dao;

import com.golano.spring.springjdbc.model.Persona;
import java.util.List;

/**
 * 28/04/2019
 * @author gaolanot
 */
public interface PersonaDao {
    List<Persona> listarPersonas();
}
