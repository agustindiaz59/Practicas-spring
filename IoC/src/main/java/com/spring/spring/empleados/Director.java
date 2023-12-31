package com.spring.spring.empleados;

import com.spring.spring.informes.Informe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Director implements Empleado{
    private Informe informe; //Campo informe (interfaz)
    @Value("${nombre}") //Se usa en conjunto con @PropertySource en el config, trae los datos de un archivo externo
    private String nombre;
    @Value("${email}")
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Director(Informe informe) {
        this.informe = informe;
    }
    //Metodo init del bean
    public void init(){
        System.out.println("Hola soy un metodo init");
    }
    //Metodo destroy del bean
    public void destroy(){
        System.out.println("Hola soy un metodo destroy");
    }

    @Override
    public void getTareas() {
        System.out.println("Soy un director");
    }

    @Override
    public String getInforme() {
        return "Informe creado por el director: " + this.informe.getInforme();
    }
}
