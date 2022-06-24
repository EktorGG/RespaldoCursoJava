package com.generationg1.hectorgomez.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2") // Establecemos el incio de la ruta x defecto
public class ParametrosRestController {
// CAPTURAR PARÁMETROS DESDE VARIABLES DEFINIDAS EN LA RUTA//
    
    //localhost:8080/api?fecha=20220613
    @RequestMapping("")
    public String fecha(@RequestParam(value="fecha") String fecha) {

        return "La fecha es: " + fecha;

    }
    
    //localhost:8080/api/seccion?modulo=25&seccion=55
    @RequestMapping("/seccion")
    public String seccion(@RequestParam(value="modulo") String modulo,
    @RequestParam(value="seccion") String seccion) {

        return "El modulo es: " + modulo + " y la sección es " + seccion;

    }

    /** Rutas con parámetros no obligatorios */


    //localhost:8080/api/date?anio=2022&mes=6&dia=13
    @RequestMapping("/date")
    public String capturarParametros(@RequestParam(value="anio", required=false) String anio,
    @RequestParam(value="mes", required=false) String mes,
    @RequestParam(value="dia", required=false) String dia) {

        return "La fecha es "+ anio + " " + mes + " " + dia;
    }

}
