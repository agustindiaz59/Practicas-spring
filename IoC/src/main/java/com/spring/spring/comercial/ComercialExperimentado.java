package com.spring.spring.comercial;

import com.spring.spring.informes.Informe;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("comercialExperimentado") //Registrar el bean en el contexto de spring, el nombre por defecto es el nombre de la clase con primera letra minuscula
@Scope //Patron de creacion de beans, singleton(por defecto) o prototype(no compatible con init y destroy)
//@Scope("prototype")
public class ComercialExperimentado {
    //@Autowired //Tambien es valido
    private Informe informe;
    public ComercialExperimentado(){ //En caso de varios constructores almenos uno debe tener autowired

    }
    //@Autowired //Funciona para inyeccion de dependencias mediante constructor, setter, o campos de clase(reflexion)
    public ComercialExperimentado(Informe informe) {
        this.informe = informe;
    }
    @Autowired //Tambien es valido
    @Qualifier("informeSemanal") //Trae el bean con ese id en caso de varias clases que inmplementan esa misma interfaz
    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    @PostConstruct //Equivalente a init-method en el ciclo de vida del bean, no debe recibir argumentos y suele ser void
    public void init(){
        System.out.println("Este es un metodo init");
    }

    @PreDestroy //Equivalente a destroy-method en el ciclo de vida del bean, no debe recibir argumentos y suele ser void
    public void destroy(){
        System.out.println("Este es un metodo destroy");
    }

}
