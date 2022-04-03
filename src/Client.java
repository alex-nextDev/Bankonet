package com.bankonet;



public class Client {
	
	private String identifiant;
	private String nom;
	private String prenom;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	
	
	public Client(String identifiant, String nom, String prenom, CompteCourant compteCourant, CompteEpargne compteEpargne)
	{
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}
	
	public double calculerAvoirGlobal()
	{
		double totalAvoirs = 0;
		
		if(this.compteEpargne!= null)
		{
			totalAvoirs = totalAvoirs + this.compteEpargne.getSolde();
			
		}
		if(this.compteCourant!= null)
		{
			totalAvoirs = totalAvoirs + this.compteCourant.getSolde();
			
		}
		return totalAvoirs;
	}
	
	
	public String toString()
	{
		String msg = "Nom : " + this.nom + "\n" + "Prenom : "  + this.prenom;
					
		return msg;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	
}
