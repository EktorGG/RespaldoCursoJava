package com.generationg1.hectorgomez.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.generationg1.hectorgomez.models.Auto;

@Repository
// JPA Repository nos permite trabajar con metodos definidos 
// <Objeto, tipo de dato de la primary key>
// Las interfaces sólo definen los métodos //
// Aqui definimos la logica de negocio o validaciones del sistema
// Querys y usar metodo que se conecta a la base de datos

public interface AutoRepository extends JpaRepository<Auto, Long> {
    //JPQL
    //Usando directamente el objeto Auto para solicitar info
    @Query("SELECT a FROM Auto a WHERE a.marca= ?1")
    List<Auto> findAllAutoMarca(String marca);
    //List<Auto> getAutoWhereMarca(String marca);

    //Query comun
    @Query(value="SELECT * FROM autos a WHERE a.marca= ?1", nativeQuery = true)
    List<Auto> buscarMarca(String marca);

    //Filtro por algunas columnas de la tabla (no es el más efectivo)
    @Query(value="SELECT a.marca, a.color FROM autos a WHERE a.marca = ?1 and a.color=?2",nativeQuery = true)
	List<Object[]> buscarMarcaColor(String marca, String color);

}