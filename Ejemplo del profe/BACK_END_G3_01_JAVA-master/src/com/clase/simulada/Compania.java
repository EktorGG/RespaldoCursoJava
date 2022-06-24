package com.clase.simulada;

import java.util.ArrayList;
import java.util.Arrays;

public class Compania {

	private String nombre;
	private Cliente[] clienteCelular;
	private ArrayList<Cliente> clientesCelular;
	private Integer cantidadClientes;
	private Integer capacidadMax;
	
	public Compania(Integer capacidadMax) {
		super();
		this.capacidadMax = capacidadMax;
		this.clienteCelular = new Cliente[capacidadMax];
		this.clientesCelular = new ArrayList<Cliente>();
		this.cantidadClientes = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente[] getClienteCelular() {
		return clienteCelular;
	}

	public void setClienteCelular(Cliente[] clienteCelular) {
		this.clienteCelular = clienteCelular;
	}

	public ArrayList<Cliente> getClientesCelular() {
		return clientesCelular;
	}

	public void setClientesCelular(ArrayList<Cliente> clientesCelular) {
		this.clientesCelular = clientesCelular;
	}

	public Integer getCantidadClientes() {
		return cantidadClientes;
	}

	public void setCantidadClientes(Integer cantidadClientes) {
		this.cantidadClientes = cantidadClientes;
	}

	public Integer getCapacidadMax() {
		return capacidadMax;
	}

	public void setCapacidadMax(Integer capacidadMax) {
		this.capacidadMax = capacidadMax;
	}

	@Override
	public String toString() {
		return "Compania [nombre=" + nombre + ", clienteCelular=" + Arrays.toString(clienteCelular)
				+ ", clientesCelular=" + clientesCelular + ", cantidadClientes=" + cantidadClientes + ", capacidadMax="
				+ capacidadMax + "]";
	}
	/*
	private -> solo la clase
	default -> clase y package
	protected -> solo clase, sub-clases todos dentro del package
	public -> todos
	*/
	
	//agregarCliente: agrega un cliente al arreglo validando que no supere la capacidad máxima
	
	public void agregarCliente(Cliente cliente) {
		
		System.out.println("capacidad maxima: "+this.capacidadMax);
		System.out.println("arreglo: "+this.clienteCelular.length);
		System.out.println("arreglo[0]"+ this.clienteCelular[4]);
		
		System.out.println("arrayList 1: "+this.clientesCelular.size());
		//validando que no supere la capacidad máxima

		if(this.clientesCelular.size() < this.capacidadMax ) {
			this.clientesCelular.add(cliente);
			this.cantidadClientes +=1; //this.cantidadClientes =this.cantidadClientes+1; this.cantidadClientes++;
		}else {
			System.out.println("Cupo completo");
		}
		System.out.println("arrayList 2: "+this.clientesCelular.size());
		
	}
	
	//buscarCliente: busca un cliente por su rut, si existe retorna true sino false.
	public boolean buscarCliente(String rut) {

		for (int i = 0; i < this.clientesCelular.size(); i++) {
			Cliente cliente = this.clientesCelular.get(i);
			//this.clientesCelular.get(i).getRut()
			//if(rut.equals(this.clientesCelular.get(i).getRut())) {
			if(rut.equals(cliente.getRut())) {
				return true;
			}
		}
			
		return false;
	}
	
	//modificarCelular: el cual recibe un rut de cliente y número nuevo, 
	//si se encuentra el cliente dentro del arreglo, 
	//se procederá a cambiar el número de celular por el nuevo número.
	public void modificarCelular(String rut, int numero) {
		for (int i = 0; i < this.clientesCelular.size(); i++) {
			Cliente cliente = this.clientesCelular.get(i);
			if(rut.equals(cliente.getRut())) {
				cliente.getCelular().setNumero(numero);
			}
		}
		
	}
	public abstract  modificarCelular22(String rut, int numero);
	
	
	
	//listarClientes: el cual imprimirá el número de celular, 
	//el nombre del cliente y si posee o no plan.
	
	public void listarClientes() {
		for (int i = 0; i < this.clientesCelular.size(); i++) {
			this.clientesCelular.get(i).getCelular().getNumero();
			System.out.println("***********");
			System.out.println("Numero celular: "+ this.clientesCelular.get(i).getCelular().getNumero());
			System.out.println("Nombre Cliente: "+ this.clientesCelular.get(i).getNombre());
			
			if(this.clientesCelular.get(i).getPlan()) {
				System.out.println("El cliente posee plan");
			}else {
				System.out.println("El cliente NO posee plan");
			}
			
		}
		
	}
	
	
}
