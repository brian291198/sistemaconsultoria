package com.jpconsultoria.sistemaconsultoria.web.app.models;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="asesores")
public class Asesor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nombres;
	
	@Column(nullable = false)
	private String apellidos;
	
	@Column(nullable = false)
	private Integer edad;
	
	@Column(nullable = false)
	private Long dni;
	
	private Long telefono;
	
	private String email;
	
	private Long bancaria;
	
	private Long interbancaria;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	
	

	public Asesor() {
	}




	public Asesor(Long id, String nombres, String apellidos, Integer edad, Long dni, Long telefono, String email,
			Long bancaria, Long interbancaria, Date createAt) {
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.bancaria = bancaria;
		this.interbancaria = interbancaria;
		this.createAt = createAt;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNombres() {
		return nombres;
	}




	public void setNombres(String nombres) {
		this.nombres = nombres;
	}




	public String getApellidos() {
		return apellidos;
	}




	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	public Integer getEdad() {
		return edad;
	}




	public void setEdad(Integer edad) {
		this.edad = edad;
	}




	public Long getDni() {
		return dni;
	}




	public void setDni(Long dni) {
		this.dni = dni;
	}




	public Long getTelefono() {
		return telefono;
	}




	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Long getBancaria() {
		return bancaria;
	}




	public void setBancaria(Long bancaria) {
		this.bancaria = bancaria;
	}




	public Long getInterbancaria() {
		return interbancaria;
	}




	public void setInterbancaria(Long interbancaria) {
		this.interbancaria = interbancaria;
	}




	public Date getCreateAt() {
		return createAt;
	}




	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	
	
	
	
	
}
