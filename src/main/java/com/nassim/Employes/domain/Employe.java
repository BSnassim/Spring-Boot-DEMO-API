package com.nassim.Employes.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMPLOYE")
public class Employe implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQUENCE")
	@SequenceGenerator(name = "SEQUENCE", sequenceName = "SEQ_EMPLOYE", allocationSize = 1)
	private Integer id;
	private String nom;
	private String prenom;
	private Integer age;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="societe_id", referencedColumnName = "id")
	private Societe societe;
	
	public Employe(String nom, String prenom, Integer age, Societe societe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.societe = societe;
	}
	
	

}
