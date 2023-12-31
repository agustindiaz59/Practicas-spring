package com.spring.spring.empleados;

import com.spring.spring.informes.Informe;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor@NoArgsConstructor //Si usas unconstructor con parametros, necesitas un constructor sin parametros si o si
public class Conserje implements Empleado{
    private Informe informe;
    private String email; //Email comun para todos los conserjes, mediante inyeccion de dependencias de campos

    public void setEmail(String email) {
        this.email = email;
    }

    //Inyeccion de dependencias mediante setter
    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    @Override
    public void getTareas() {
        System.out.println("Soy un conserje");
    }

    @Override
    public String getInforme() {
        return "Informe creado por el conserje: " + this.informe.getInforme();
    }
}
