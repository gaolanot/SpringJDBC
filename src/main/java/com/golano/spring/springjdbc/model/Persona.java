/*
 * Clase Modelo Tabla  Persona
 * http://acodigo.blogspot.com/2017/03/spring-acceso-datos-con-jdbc.html
 */
package com.golano.spring.springjdbc.model;

/**
 *
 * @author admin
 */
public class Persona {
    private Integer id;
    private String nombre;
    private String apellido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public String toString(){
        return "Persona{id="+this.id+", nombre="+this.nombre+", apellido="+
                this.apellido+"}";
    }
}
