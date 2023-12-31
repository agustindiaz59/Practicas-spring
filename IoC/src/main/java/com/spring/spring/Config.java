package com.spring.spring;

import com.spring.spring.empleados.Conserje;
import com.spring.spring.empleados.Director;
import com.spring.spring.empleados.Maestro;
import com.spring.spring.informes.InformeDia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //Reemplaza al xml con codigo java
@ComponentScan("com.spring.spring") //Equivalente a context:component-scan en el xml
@PropertySource("directorProperties.txt") //Enlaza a un archivo de propiedades externo
@PropertySource("classpath:propiedades.properties") //Se pueden usar varios
public class Config {
    @Bean //Retorna el bean solicitado, equivalente a bean en el xml, debe llamarse igual al atributo que retorna pero primera letra minuscula
    public Director director(){ //El nombre del metodo debe ser igual al ID del bean que retorna
        return new Director(informeDia());
    }
    @Bean
    public InformeDia informeDia(){
        return new InformeDia();
    }
    @Bean
    public Conserje conserje(){
        return new Conserje();
    }
    @Bean
    public Maestro maestro(){
        return new Maestro();
    }
}
