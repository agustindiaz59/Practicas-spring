package com.spring.spring.informes;

import org.springframework.stereotype.Component;

@Component
public class InformeSemanal implements Informe{
    @Override
    public String getInforme() {
        return "Este es el informe semanal";
    }
}
