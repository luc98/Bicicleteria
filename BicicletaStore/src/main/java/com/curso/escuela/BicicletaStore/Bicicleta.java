package com.curso.escuela.BicicletaStore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bicicleta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "marca")
	private String marca;
	@Column(name = "modelo")
	private String modelo;
	@Column(name = "precio")
	private Long precio;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPrecio() {
		return precio;
	}
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Alumno: \n" +
                "   id: " + this.id +
                "\n   marca: " + this.marca +
                "\n   modelo:  " + this.modelo+
                "\n   precio:  " + this.precio;
	}
	
	/*
	 * use bicicleteria;

create table bicicleta (
	id int NOT NULL AUTO_INCREMENT,
    marca varchar(20),
    modelo varchar(20),
    precio int,
    primary key(id)
)
use bicicleteria;
INSERT INTO `bicicleteria`.`bicicletas` (`marca`, `modelo`,`precio`) VALUES ('Marca1', 'Modelo3',2000);
INSERT INTO `bicicleteria`.`bicicletas` (`marca`, `modelo`,`precio`) VALUES ('Marca1', 'Modelo3',2000);
INSERT INTO `bicicleteria`.`bicicletas` (`marca`, `modelo`,`precio`) VALUES ('Marca2', 'Modelo4',4000);
INSERT INTO `bicicleteria`.`bicicletas` (`marca`, `modelo`,`precio`) VALUES ('Marca3', 'Modelo1',6000);




	 * */
	
	
	
	
	
}
