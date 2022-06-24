package com.generationg1.hectorgomez.controllers;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.generationg1.hectorgomez.models.Auto;
import com.generationg1.hectorgomez.services.AutoService;

@Controller
@RequestMapping("/auto") //Pagina x defecto
public class AutoController {
    @Autowired //Permite instanciar otra clase, en este caso, del service
    AutoService autoService; //Instanciamos la clase para utilizar los métodos de esta clase
    

    //Hacer la instancia del jsp
    @RequestMapping("")
    //Creamos la función en la primera instancia
    public String auto(@ModelAttribute("auto") Auto auto){
        return "auto.jsp";
    }

    //Creamos una instancia nueva para capturar datos
    @PostMapping("/solicitar")
    public String pedirAuto(@Valid @ModelAttribute("auto") Auto auto, //@Valid Verifica que los datos sean correctos para la base de datos.
    BindingResult resultado, //Creamos un objeto llamado resultado para validar que llegaron los datos si o no
    Model model){   //Model es la instrucción que permite enviar los datos al jsp
    if(resultado.hasErrors()){
    model.addAttribute("mensajeError", "Los datos ingresados no son válidos");
    return "auto.jsp";
    } else {
        System.out.println("Marca del auto: " + auto.getMarca() + " Color del auto: "+ auto.getColor()+" Velocidad máxima del auto: " + auto.getVelMax());
            autoService.saveAuto(auto); //Capturamos el objeto en el sout y lo guardamos en el saveauto
            List <Auto> listaDeAutos = autoService.findAll();
            model.addAttribute("autosCapturados", listaDeAutos);
            return "mostrarAutos.jsp";
    }
    
    }
    //solo mostrar el listado de autos
	@RequestMapping("/mostrar")
	public String mostrar(Model model) {
		//obtener una lista de autos
		List<Auto> listaAutos = autoService.findAll();
		//pasamos la lista de autos al jsp
		model.addAttribute("autosCapturados", listaAutos);
		return "mostrarAutos.jsp";
    }


    //Capturar el dato de lo que se quiere editar
    @RequestMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model){ //Capturar el objeto con la id
        System.out.println("el id es: " +id); //Lo mostramos en consola para verificar
        Auto auto = autoService.buscarId(id); //Buscar el objeto en el sql
        System.out.println(auto.getMarca());
        model.addAttribute("auto", auto); //Pasar el objeto del sql al jsp

        return "editarAuto.jsp";}
    

    //Aquí actualizamos la base de datos con lo que se ha editado
    //localhost:8080/auto/actualizar/{id}
    @PostMapping("/actualizar/{id}")
    public String actualizarAuto(@PathVariable("id") Long id,
    @ModelAttribute("auto") Auto auto, //@Valid Verifica que los datos sean correctos para la base de datos.
        Model model){   //Model es la instrucción que permite enviar los datos al jsp
        System.out.println("el id al actualizar es: " + id);
        auto.setId(id);
            System.out.println("Marca del auto: " + auto.getMarca() + " Color del auto: "+ auto.getColor()+" Velocidad máxima del auto: " + auto.getVelMax());
            autoService.saveAuto(auto); //Capturamos el objeto y lo guardamos en el saveauto
            List <Auto> listaDeAutos = autoService.findAll();
            model.addAttribute("autosCapturados", listaDeAutos);
            return "redirect:/auto/mostrar";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarAuto(@PathVariable("id") Long id) {

        autoService.eliminarPorId(id);

        return "redirect:/auto/mostrar";

}
}