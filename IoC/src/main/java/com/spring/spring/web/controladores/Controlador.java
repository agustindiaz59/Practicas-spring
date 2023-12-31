package com.spring.spring.web.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
    @RequestMapping("/h")
    public String muestraPagina(){
      return "pagina";
    }

}
