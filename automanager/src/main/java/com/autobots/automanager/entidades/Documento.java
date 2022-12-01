package com.autobots.automanager.entidades;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Documento {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = false, nullable = true)
	private String numero;
	@Column(nullable = true)
	private String tipo;

}