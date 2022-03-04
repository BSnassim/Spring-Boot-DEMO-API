package com.nassim.Employes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="SOCIETE")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Societe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQUENCE")
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_SOCIETE", allocationSize = 1)
	private Integer id;
	private String nom;
	
	public Societe(String nom) {
		super();
		this.nom = nom;
	}

	
}
