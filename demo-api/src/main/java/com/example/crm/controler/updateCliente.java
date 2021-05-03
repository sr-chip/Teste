package com.example.crm.controler;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class updateCliente {
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private int idade;
	
}
