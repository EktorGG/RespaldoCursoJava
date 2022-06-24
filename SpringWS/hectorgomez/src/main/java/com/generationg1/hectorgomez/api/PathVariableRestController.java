package com.generationg1.hectorgomez.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var") //localhost:8080/var -> path (o ruta) por default
public class PathVariableRestController {
    /**CAPTURAR VARIABLES DESDE LA RUTA DIRECTAMENTE */

    //localhost:8080/var/anio/2022/mes/06/dia/13
    @RequestMapping("/anio/{a}/mes/{m}/dia/{d}")
    public String capturarVariablesPath(@PathVariable("a") String anio,
    @PathVariable("m") String mes, @PathVariable("d") String dia)
    { 
        return "La fecha es "+ anio + mes + dia;
    }

    //localhost:8080/var/fecha/{anio}/{mes}/{dia}
    //localhost:8080/var/fecha/2022/06/13
    @RequestMapping("/fecha/{anio}/{mes}/{dia}")
    public String rutaCorta(
    @PathVariable("anio") String anio,
    @PathVariable("mes") String mes, 
    @PathVariable("dia") String dia)
    { 
        return "La fecha es "+ anio +"/"+ mes +"/"+ dia;
    }



}