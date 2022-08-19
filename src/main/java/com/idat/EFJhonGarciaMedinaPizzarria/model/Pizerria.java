package com.idat.EFJhonGarciaMedinaPizzarria.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pizerria")
public class Pizerria {
	
	private Integer idPizerria;
	private String direccion;
	private String sede;

}
