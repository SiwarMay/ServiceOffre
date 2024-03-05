package com.iset.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Offre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code; 
	private String intitulé;
	private String specialité; 
	private String société; 
	private int nbpostes; 
	private String pays;

	public Offre() {
		super();
	}

	public Offre(String intitulé, String specialité, String société, int nbpostes, String pays) {
		super();
		this.intitulé = intitulé;
		this.specialité = specialité;
		this.société = société;
		this.nbpostes = nbpostes;
		this.pays = pays;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getIntitulé() {
		return intitulé;
	}

	public void setIntitulé(String intitulé) {
		this.intitulé = intitulé;
	}

	public String getSpecialité() {
		return specialité;
	}

	public void setSpecialité(String specialité) {
		this.specialité = specialité;
	}

	public String getSociété() {
		return société;
	}

	public void setSociété(String société) {
		this.société = société;
	}

	public int getNbpostes() {
		return nbpostes;
	}

	public void setNbpostes(int nbpostes) {
		this.nbpostes = nbpostes;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "Offre [code=" + code + ", intitulé=" + intitulé + ", specialité=" + specialité + ", société=" + société
				+ ", nbpostes=" + nbpostes + ", pays=" + pays + "]";
	}
	
	
	
}
