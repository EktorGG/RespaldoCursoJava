package com.generationg1.hectorgomez.services;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.generationg1.hectorgomez.models.Auto;
import com.generationg1.hectorgomez.repositories.AutoRepository;

@Service
public class AutoService {
     /**Lógica de negocio */
    /**Filtros necesarios para la empresa */
    @Autowired
    AutoRepository autoRepository;

    public void saveAuto(@Valid Auto auto) {
        autoRepository.save(auto);
    }
    /** Va a buscar la lista de autos */
    public List<Auto> findAll() {
        return autoRepository.findAll();
    }

    public void guardarAuto(@Valid Auto auto) {
    }

    /** Para consultar por un dato en la database x su id */
    public Auto buscarId(Long id) {
        return autoRepository.findById(id).get(); //.get() espeficica el tipo de dato.
    }

    /** Para eliminar un objeto por su id */
    public void eliminarPorId(Long id){
        autoRepository.deleteById(id); 
    }
    
}
