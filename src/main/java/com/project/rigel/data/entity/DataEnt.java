package com.project.rigel.data.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DataEnt implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -5579557205020475648L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(value = "id") 
	private Integer id;
	
	@JsonProperty(value = "modelo") 
	private String modelo;
	
	@JsonProperty(value = "carro") 
	private String carro;
	
	@JsonProperty(value = "usuario") 
	private Integer usuario;
	
	
}
