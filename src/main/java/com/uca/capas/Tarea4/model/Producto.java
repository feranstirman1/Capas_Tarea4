package com.uca.capas.Tarea4.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Producto {

	@Size(min=12,max=12,message="El codigo debe ser de exactamente 12 caracteres")
	String codigo;
	
	@Size(min=1,max=100,message="El nombre del producto debe tener entre 1 y 100 caracteres")
	String nombre;
	
	@Size(min=1,max=100,message="El nombre de la marca debe tener entre 1 y 100 caracteres")
	String marca;
	
	@Size(min=1,max=500,message="El nombre de la descripcion del producto debe tener entre 1 y 500 caracteres")
	String descripcion;
	
	@Pattern(regexp = "^\\d+$",message="El numero debe de ser un entero")
	String existencias;
	
	@Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$",message="Debe introducir una fecha valida"
			+ " con el formato dd/mm/yyyy")
	String fecha;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getExistencias() {
		return existencias;
	}
	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
