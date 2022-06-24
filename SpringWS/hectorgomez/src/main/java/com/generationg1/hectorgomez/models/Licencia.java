package com.generationg1.hectorgomez.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licencias")
public class Licencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Definimos estos valores como PK
    private Long id;

    private Integer numero;
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date fechaVencimiento;
    private String clase;
    private String estado;

    //opconales, sirven para la gestión de base de datos, nO SE AÑADEN A LOS CONSTRUCTORES NI GET AND SET
    @Column(updatable = false) //Propiedad de la columna, updatetable no es actualziable
    private Date createdAt; //Fecha de creación

    private Date updatedAt; //Fecha de actualización
    /*private Date deletedAt; //Fecha de eliminación*/

    //Relaciones OneToOne (1a1)
    @OneToOne(fetch=FetchType.LAZY) // .LAZY trae datos DE LA RELACIÓN a petición
    /*@OneToOne(fetch=FetchType.EAGER) // .EAGER TRAE LOS DATOS DE FORMA AUTOMÁTICA */
    @JoinColumn(name="usuario_id") // PK de la otra entiedad
    private Usuario usuario; // El objeto al que se hace referencia


    //Constructor Vacío
    public Licencia() {
    }


    //Connstructor lleno
    public Licencia(Long id, Integer numero, Date fechaVencimiento, String clase, String estado, Date createAt,
            Date updateAt) {
        this.id = id;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.clase = clase;
        this.estado = estado;
    }


    //Getter and Setter
    public Long getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
