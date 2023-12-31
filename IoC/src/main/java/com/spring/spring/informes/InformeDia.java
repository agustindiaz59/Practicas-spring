package com.spring.spring.informes;

import org.springframework.stereotype.Component;

@Component
public class InformeDia implements Informe{
    @Override
    public String getInforme() {
        return "Este es un informe del dia";
    }
}
