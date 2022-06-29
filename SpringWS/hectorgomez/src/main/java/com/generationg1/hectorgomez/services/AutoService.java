package com.generationg1.hectorgomez.services;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.generationg1.hectorgomez.models.Auto;
import com.generationg1.hectorgomez.repositories.AutoRepository;

@Service
@Transactional
public class AutoService {
     /**Lógica de negocio */
    /**Filtros necesarios para la empresa */
    @Autowired
    AutoRepository autoRepository;

    //Guardar un auto
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

    //Buscar auto por su marca
    public List<Auto> buscarMarca(String marca) {
        //llamado a un metodo propio
        //return autoRepository.buscarMarca(marca); <- RETORNO CON QUERY COMUN
        return autoRepository.findAllAutoMarca(marca); //<- rETORNO CON QUERY USANDO EL OBJETO
    }
    
    //PAGINACION (Esto va al inicio, arriba bajo el autowired)
    //Variable estática, cantidad de datos a mostrar por página
    private static final int LOTE = 5;

    public Page<Auto> paginarAutos(int numeroPagina){
        PageRequest pageRequest = PageRequest.of(numeroPagina, LOTE, Sort.Direction.ASC, "marca0");
        //Page<Auto> autos = autoRepository.findAll(pageRequest);
        return autoRepository.findAll(pageRequest);
    }




}
