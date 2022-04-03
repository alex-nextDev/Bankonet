package com.bankonet;

public final class CompteCourant extends Compte {
	
	
	
	private double montantDecouvertAutorise; 
	//private static int nbCompteCourant = 0;
	

	
	public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise)
	{	
		super(numero, intitule, solde);
		
		this.montantDecouvertAutorise = montantDecouvertAutorise;
		
	}
	
	public String toString() {
		
		String mess = "Compte Courant Num : " + this.getNumero() + "\n" +
				"Intitulé : " + this.getIntitule() + "\n" +
				"Solde : " + this.getSolde() + " $" + "\n" +
				"Découvert autorisé : " + this.montantDecouvertAutorise + " $" + "\n"; 
		

		return mess;
	}
	
	
	
	/*
	 * Vérifier que solde - montant > découvert autorisé.
	 */
	
	
	public boolean debitAutorise(double montant)
	{
		boolean autorise =false;
		
		if (this.getSolde() - montant > this.getMontantDecouvertAutorise())
		{
			autorise = true;
		}
		else
		{
			autorise = false;
		}
		return autorise;
	}
	
	

	
	

	
	
	public double getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}


	public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}



}
