package com.mmonsoor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="canape")
public class Canape {
	//Les attributs de la classe
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="nombre_places")
	private int nombrePlaces;
	@Column(name="motif")
	private String motif;
	@Column(name="couleur")
	private String couleur;
	//Le constructeur
	public Canape(int tmpNombrePlaces,String tmpMotif,String tmpCouleur) {
		nombrePlaces=tmpNombrePlaces;
		motif=tmpMotif;
		couleur=tmpCouleur;	
	}
	
	public Canape() {
	}
	
	
	public String descriptionCanape() {
		return ("Je suis un canapé qui a "+nombrePlaces+ " places."+"J'ai un motif de type "+motif+" et j'ai la couleur "+couleur+".");
	}

	public int getNombrePlaces() {
		return nombrePlaces;
	}

	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	




}
