package com.bankonet;

public class CompteEpargne extends Compte {
	
	
	
	private double tauxInteret;
	
	
	public CompteEpargne(String numero, String intitule, double solde, double tauxInteret)
	{
		super(numero, intitule, solde);
		this.tauxInteret = tauxInteret;
	}
	
	
	
	
	public String toString() {
		
		String mess = "Compte Epargne Num : " + this.getNumero() + "\n" +
				"Intitulé : " + this.getIntitule() + "\n" +
				"Solde : " + this.getSolde() + " $" + "\n" +
				"Taux d'intérêt : " + this.tauxInteret + " %" + "\n"; 
			

		return mess;
	}
	
	
/*
 * Vérifier que solde - montant > 0.
 */


	public boolean debitAutorise(double montant)
	{
		boolean autorise =false;
		
		if ( this.getSolde() - montant > 0)
		{
			autorise = true;
		}
		else
		{
			autorise = false;
		}
		return autorise;
	}
	
	

	public double getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	
	

}
