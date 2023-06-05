package com.panvdev.apirest_prueba.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nom_partido;
	private String departamento;
	private String municipio;
	
	private String num_mesa;
	private String votos;
	
	
	
	public Cliente() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom_partido() {
		return nom_partido;
	}

	public void setNom_partido(String nom_partido) {
		this.nom_partido = nom_partido;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	
	public String getNum_mesa() {
		return num_mesa;
	}

	public void setNum_mesa(String num_mesa) {
		this.num_mesa = num_mesa;
	}

	public String getVotos() {
		return votos;
	}

	public void setVotos(String votos) {
		this.votos = votos;
	}
	
	
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
