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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="autos_ventas")
public class AutoVenta {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        
        private Integer cantidad;
        private Float subtotal;
        private Date fechaDeVenta;
        @Column(updatable = false) //Propiedad de la columna, updatetable no es actualziable
        private Date createdAt; //Fecha de creación

        private Date updatedAt; //Fecha de actualización
        /*private Date deletedAt; //Fecha de eliminación*/

        //Dos relaciones ManyToOne son igual a una ManyToMany
        //Relacion con Auto ManyToOne
        //RELACIÓN ManyToOne
        @ManyToOne(fetch=FetchType.LAZY) // .LAZY trae datos DE LA RELACIÓN a petición
        /*@OneToOne(fetch=FetchType.EAGER) // .EAGER TRAE LOS DATOS DE FORMA AUTOMÁTICA */
        @JoinColumn(name="auto_id") // PK de la otra entiedad
        private Auto auto; // El objeto al que se hace referencia


        //Relación con compraVeta ManyToOne
        //RELACIÓN ManyToOne
        @ManyToOne(fetch=FetchType.LAZY) // .LAZY trae datos DE LA RELACIÓN a petición
        /*@OneToOne(fetch=FetchType.EAGER) // .EAGER TRAE LOS DATOS DE FORMA AUTOMÁTICA */
        @JoinColumn(name="compra_venta_id") // PK de la otra entiedad
        private CompraVenta compraVenta; // El objeto al que se hace referencia

        //Constructores
        //Vacío
        public AutoVenta() {
        }

        //Lleno
        public AutoVenta(Integer cantidad, Float subtotal) {
                this.cantidad = cantidad;
                this.subtotal = subtotal;
        }

        //Getter And Setter
        public Long getId() {
                return id;
        }


        public void setId(Long id) {
                this.id = id;
        }


        public Integer getCantidad() {
                return cantidad;
        }


        public void setCantidad(Integer cantidad) {
                this.cantidad = cantidad;
        }


        public Float getSubtotal() {
                return subtotal;
        }


        public void setSubtotal(Float subtotal) {
                this.subtotal = subtotal;
        }


        public Date getFechaDeVenta() {
                return fechaDeVenta;
        }


        public void setFechaDeVenta(Date fechaDeVenta) {
                this.fechaDeVenta = fechaDeVenta;
        }


        public Auto getAuto() {
                return auto;
        }


        public void setAuto(Auto auto) {
                this.auto = auto;
        }


        public CompraVenta getCompraVenta() {
                return compraVenta;
        }


        public void setCompraVenta(CompraVenta compraVenta) {
                this.compraVenta = compraVenta;
        }

        @PrePersist
        protected void onCreate(){
        this.createdAt = new Date();
        }
        @PreUpdate
        protected void onUpdate(){
        this.updatedAt = new Date();
        }

}
