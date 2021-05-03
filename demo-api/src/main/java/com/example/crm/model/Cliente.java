package com.example.crm.model;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(nullable = false, name = "nome")
	private String nome;
	
	@Column(nullable = false, name = "idade")
	private int idade;
	
}
