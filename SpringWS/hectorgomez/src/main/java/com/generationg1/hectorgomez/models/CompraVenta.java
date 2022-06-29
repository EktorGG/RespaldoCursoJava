package com.generationg1.hectorgomez.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="comprasVentas")
public class CompraVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Range(min=0)
    private Float monto;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:MS:SS")
    private Date fecha;

    //RELACIÓN ManyToOne
    @ManyToOne(fetch=FetchType.LAZY) // .LAZY trae datos DE LA RELACIÓN a petición
    /*@OneToOne(fetch=FetchType.EAGER) // .EAGER TRAE LOS DATOS DE FORMA AUTOMÁTICA */
    @JoinColumn(name="cliente_id") // PK de la otra entiedad
    private Cliente cliente; // El objeto al que se hace referencia

    //opconales, sirven para la gestión de base de datos, nO SE AÑADEN A LOS CONSTRUCTORES NI GET AND SET
    @Column(updatable = false) //Propiedad de la columna, updatetable no es actualziable
    private Date createdAt; //Fecha de creación

    private Date updatedAt; //Fecha de actualización
    /*private Date deletedAt; //Fecha de eliminación*/

    //Constructor vacio
    public CompraVenta() {
    }

    //Constructor con parámetros
    public CompraVenta(@Range(min = 0) Float monto, Date fecha, Cliente cliente) {
        this.monto = monto;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    //Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

        

}

