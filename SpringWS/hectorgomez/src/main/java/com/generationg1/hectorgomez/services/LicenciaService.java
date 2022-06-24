package com.generationg1.hectorgomez.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg1.hectorgomez.models.Licencia;
import com.generationg1.hectorgomez.repositories.LicenciaRepository;

@Service
public class LicenciaService {
    @Autowired
    LicenciaRepository licenciaRepository;

    public void save(@Valid Licencia licencia) {
        //almacenar en base de datos la licencia
        
        licenciaRepository.save(licencia);
        
    }

    public List<Licencia> findAll() {
        return licenciaRepository.findAll();

    }

}
