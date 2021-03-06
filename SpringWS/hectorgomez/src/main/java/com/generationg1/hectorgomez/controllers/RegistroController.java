package com.generationg1.hectorgomez.controllers;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.generationg1.hectorgomez.models.Usuario;
import com.generationg1.hectorgomez.services.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    //inyeccion de dependencias
    @Autowired
    UsuarioService usuarioService;
    
    // Ruta para desplegar el JSP
    // localhost:8080/registro
    @RequestMapping("")
    public String registro(@ModelAttribute("usuario") Usuario usuario ){
       //pasamos el objeto sin atributos

        return "registro.jsp"; // Página a desplegar
    }
    
    //ruta para capturar los datos del formulario
    @PostMapping("/usuario/respaldo")
    public String registroUsuario(@RequestParam(value = "nombre") String nombre,
    @RequestParam(value = "apellido") String apellido,
    @RequestParam(value = "edad") String edad)
    {
        System.out.println("Parametro nombre= " + nombre);
        System.out.println("Parametro apellido= "+ apellido);
        System.out.println("Parametro edad= " + edad);

        return "registro.jsp"; //La página a desplegar
    }
    
    @PostMapping("/usuario")
    public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, 
    BindingResult resultado,
    Model model) {

        if(resultado.hasErrors()) { //capturando si existe error en el ingreso de datos 
            model.addAttribute("msgError", "Debe ingresar los datos correctamente");
            return "registro.jsp";
        } else {        

        //Capturamos el objeto con los atributos llenos
        System.out.println(usuario.getNombre()+ " " + usuario.getApellido()+" "+ usuario.getEdad());
        
        //Enviar el objeto al service
        usuarioService.saveUsuario(usuario);

            return "index.jsp"; // Página a desplegar
        }
    
    }

}