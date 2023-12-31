package com.spring.spring.empleados;

import com.spring.spring.informes.Informe;

public class Maestro implements Empleado{
    private Informe informe;
    private String materia;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Maestro() {
    }

    public Maestro(Informe informe) {
        this.informe = informe;
    }

    @Override
    public void getTareas() {
        System.out.println("Soy un maestro");
    }

    @Override
    public String getInforme() {
        return "Informe creado por el maestro: " + this.informe.getInforme();
    }
}
