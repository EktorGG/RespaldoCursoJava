package com.generationg1.hectorgomez.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String descripcion;

    //Relacion ManyToMany
    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY) //Con este nombre se conectará a una lista 
    private List<Usuario> usuarios;

    //opconales, sirven para la gestión de base de datos, nO SE AÑADEN A LOS CONSTRUCTORES NI GET AND SET
   @Column(updatable = false) //Propiedad de la columna, updatetable no es actualziable
   private Date createdAt; //Fecha de creación

   private Date updatedAt; //Fecha de actualización
   /*private Date deletedAt; //Fecha de eliminación*/

public Rol() {
}

public Rol(String nombre, String descripcion, List<Usuario> usuarios) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.usuarios = usuarios;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public List<Usuario> getUsuarios() {
    return usuarios;
}

public void setUsuarios(List<Usuario> usuarios) {
    this.usuarios = usuarios;
}

    

}
