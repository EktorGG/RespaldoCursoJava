package com.generationg1.hectorgomez.models;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="autos")
public class Auto {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Definimos estos valores como PK
    private Long id;

    @NotNull
    private String marca;

    @NotNull
    private String color;

    @NotNull
    private Float velMax;

    //opconales, sirven para la gestión de base de datos, nO SE AÑADEN A LOS CONSTRUCTORES NI GET AND SET
    @Column(updatable = false) //Propiedad de la columna, updatetable no es actualziable
    private Date createdAt; //Fecha de creación

    private Date updatedAt; //Fecha de actualización
    /*private Date deletedAt; //Fecha de eliminación*/

    //Constructor vacío
    public Auto() {
    }

    //Constructor con parámetros
    public Auto(Long id, @NotNull String marca, @NotNull String color, @NotNull Float velMax) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.velMax = velMax;
    }


    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getVelMax() {
        return velMax;
    }

    public void setVelMax(Float velMax) {
        this.velMax = velMax;
    }

    
    // Insertará en el atributo, la fecha antes de insertar a la base de datos
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
