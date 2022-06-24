package com.generationg1.hectorgomez.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationg1.hectorgomez.models.Auto;
import com.generationg1.hectorgomez.services.AutoService;


@RestController
@RequestMapping("/api")
public class ApiRestController {
    
    @Autowired //Inyeccion de dependencia de clase (Traemos una clase para usar sus métodos internamente)
    AutoService autoService; //Esta es la instancia creada, y la capturamos

    //localhost:8080/api/obtener/autos
    @RequestMapping(value="/obtener/autos")
    public List<Auto> obtenerListaAutos(){
        List<Auto> listaAutos = autoService.findAll();
        return listaAutos;

    }
    /*API (JSON) JavaScript Object Notation (JSON)
    es un formato basado en texto estándar 
    para representar datos estructurados en 
    la sintaxis de objetos de JavaScript.*/

}
