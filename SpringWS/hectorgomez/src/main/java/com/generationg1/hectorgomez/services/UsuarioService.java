package com.generationg1.hectorgomez.services;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.generationg1.hectorgomez.models.Usuario;
import com.generationg1.hectorgomez.repositories.UsuarioRepository;

@Service
public class UsuarioService { 
    /**Lógica de negocio */
    /**Filtros necesarios para la empresa */
    @Autowired
    UsuarioRepository usuarioRepository;

    public void saveUsuario(@Valid Usuario usuario) {
        usuarioRepository.save(usuario);
    }
    
    //Obteniendo la lista de usuarios
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }
    
    
}
