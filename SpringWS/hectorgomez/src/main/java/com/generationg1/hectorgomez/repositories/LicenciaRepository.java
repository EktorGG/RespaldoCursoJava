package com.generationg1.hectorgomez.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generationg1.hectorgomez.models.Licencia;

@Repository
public interface LicenciaRepository extends JpaRepository<Licencia, Long> {
    
}
