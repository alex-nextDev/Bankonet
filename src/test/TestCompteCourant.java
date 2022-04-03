package com.bankonet.test;

import com.bankonet.CompteCourant;
import com.bankonet.DebitException;

public class TestCompteCourant {

	public static void main(String[] args) throws DebitException {
		
				
				
				CompteCourant unCompteCourant1 = new CompteCourant("1 ", "Num Compte 1", 120000.00, 30000.00);
				CompteCourant unCompteCourant2 = new CompteCourant("2", "Num Compte 2", 10.00, 300.00);
				CompteCourant unCompteCourant3 = new CompteCourant("3", "Num Compte 3", 0.00, 0.00);
				
				CompteCourant[] compteCourantTab = new CompteCourant[3];
				
			    compteCourantTab[0] = unCompteCourant1;
			    compteCourantTab[1] = unCompteCourant2;
			    compteCourantTab[2] = unCompteCourant3;
			    
			  
			    unCompteCourant1.crediter(40.00);
				unCompteCourant1.debiter(24.00);
				
				unCompteCourant2.crediter(40.00);
				unCompteCourant2.debiter(24.00);
				
				unCompteCourant3.crediter(10.00);
				unCompteCourant3.debiter(100.00);
				
				
				int solde = 1000;
				
				switch(solde)
				{
				case 0:
					System.out.println("solde nul");
					break;
				case 10000:
					System.out.println("solde créditeur");
					break;
				default:
					System.out.println("ras");
					break;
				}
				
				
				for (int i = 0; i < 3; i++)
				{
					System.out.println(compteCourantTab[i].toString());
				}
			  
				
	}

}
