package com.generationg1.hectorgomez.models;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuarios")

public class Usuario {
    //Atributos
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Size(min=3, max=20) //Size permite limitar la cantidad de carácteres
    private String nombre;
    @Size(min=3, max=20)
    private String apellido;

    
    private Integer edad;
    @NotNull
    @Size(min=6, max=10)
    private String password;
    
   //opconales, sirven para la gestión de base de datos, nO SE AÑADEN A LOS CONSTRUCTORES NI GET AND SET
   @Column(updatable = false) //Propiedad de la columna, updatetable no es actualziable
   private Date createdAt; //Fecha de creación

   private Date updatedAt; //Fecha de actualización
   /*private Date deletedAt; //Fecha de eliminación*/

   //Relaciones OneToOne (1a1)
   @OneToOne(mappedBy ="usuario",cascade=CascadeType.ALL ,fetch=FetchType.LAZY) //CASCADE ES UNA RESTRICCION QUE IMPIDE ELIMINAR EL USUARIO SI NO SE HA ROTO LA RELACION CON LICENCIA
    private Licencia licencia;

    //Relaciones ManyToMany
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
        name="roles_usuarios", // Nombre de tabla relacional
        joinColumns = @JoinColumn(name="usuario_id"), // Desde la entidad actual
        inverseJoinColumns= @JoinColumn(name="rol_id") // La otra entidad o tabla
    )
    private List<Rol> roles; //Esta lista hace referencia a la columna foreanea

    //Constructor vacío
    public Usuario() {

    }

    //Construccion con parametros
    public Usuario(Long id, @Size(min = 3, max = 20) String nombre, @Size(min = 3, max = 20) String apellido,
            Integer edad, @NotNull @Size(min = 6, max = 10) String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.password = password;

    }


    // Getter and Setter
    public Long getId() {
        return id;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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