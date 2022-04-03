package com.bankonet;

public abstract class Compte {
	
	private String numero;
	private String intitule;
	private double solde;
	
	public abstract boolean debitAutorise(double montant);
	
	public Compte(String numero, String intitule, double solde)
	{
		this.numero = numero;
		this.intitule = intitule;
		this.solde = solde;
		
	}
	

	public void crediter(double montant) {
		
		solde = solde + montant;
	}
	
	
	
	
	public void debiter(double montant) throws DebitException
	{
		this.debitAutorise(montant);
		this.setSolde(this.getSolde() - montant);
	}
	
	
	public String toString() {
		
		String mess = "Num de compte : " + this.numero + "\n" +
				"Intitulé : " + this.intitule + "\n" +
				"Solde : " + this.solde + " $" + "\n" +
				"+------------------------------------------------------+";

		return mess;
	}
	
	
	public void effectuerVirement(Compte compte, double montant) throws CreditException
	{
	
		try
		{
			this.debiter(montant);
		}
		catch (DebitException e)
		{
			
			e.printStackTrace();
		}
		    compte.crediter(montant);
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde)
	{
		this.solde = solde;
	}

	
	

}
