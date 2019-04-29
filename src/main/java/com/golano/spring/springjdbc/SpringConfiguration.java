/*
 * Clase de configuración para Spring
 * http://acodigo.blogspot.com/2017/03/spring-acceso-datos-con-jdbc.html
 */
package com.golano.spring.springjdbc;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * 28/04/2019
 * @author gaolanot
 */
@Configuration
@ComponentScan(basePackages = "com.golano.spring.springjdbc.dao") //indica en que
                //paquete se encuentran las clases anotadas
public class SpringConfiguration {
    //Clase de conexión a la base de datos
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/23people");
        dataSource.setUsername("23people");
        dataSource.setPassword("pasa123");
        return dataSource;
    }
            
}
