package com.generationg1.hectorgomez.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.generationg1.hectorgomez.models.Usuario;

@Controller
public class IndexController {
    //http://localhost:8080
    @RequestMapping("/") //anotacion para caputar las rutas
    public String index(Model model) {
        model.addAttribute("apellidos", "Gomez Godoy");
        model.addAttribute("nombre", "Héctor");
        model.addAttribute("edad", "29");

        //Instancia de usuario
        Usuario usuario = new Usuario();

        // Pasando el usuario a la vista JSP
        model.addAttribute("usuario", usuario);

        return "index.jsp";
    }

}
