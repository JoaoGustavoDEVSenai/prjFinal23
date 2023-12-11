package com.senai.sarah.PrjGame.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "tb_jogo")
public class Jogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String integrantes;
	private String squad;
	
	private String url;
	private String thumbnailpath;

	public Jogo() {

	}

	

	public Jogo(Long id, String name, String integrantes, String squad, String url, String thumbnailpath) {
		super();
		this.id = id;
		this.name = name;
		this.integrantes = integrantes;
		this.squad = squad;
		this.url = url;
		this.thumbnailpath = thumbnailpath;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getThumbnailpath() {
		return thumbnailpath;
	}

	public void setThumbnailpath(String thumbnailpath) {
		this.thumbnailpath = thumbnailpath;

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}



	public String getIntegrantes() {
		return integrantes;
	}



	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}



	public String getSquad() {
		return squad;
	}



	public void setSquad(String squad) {
		this.squad = squad;
	}
	
	

}
