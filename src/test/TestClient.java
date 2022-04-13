package com.bankonet.test;

import com.bankonet.Client;
import com.bankonet.Compte;
import com.bankonet.CompteCourant;
import com.bankonet.CompteEpargne;
import com.bankonet.CompteException;

public class TestClient {

	public static void main(String[] args) throws CompteException {
		
		
		Client client1 = new Client("N0-0FTHEB34ST", "Bruce", "Dickinson", new CompteCourant("1", "Num Compte 1", 120000.00, -30000.00), new CompteEpargne("BD01", "Num Epargne 01", 20000.00, 5.00));
		Client client2 = new Client("N0-US3L3SST4LK", "Silent", "Bob", new CompteCourant("2", "Num Compte 2", 10.00, -300.00), new CompteEpargne("SB01", "Num Epargne 02", 100.00, 2.00));
		Client client3 = new Client("N0-W444444444Y", "Chronic", "Jay", new CompteCourant("3", "Num COmpte 3", 1.00, -100.00), new CompteEpargne("CJ01", "Num Epargne 03", 1.00, 1.00));
		Client[] clientTab = new Client[3];
	
		clientTab[0] = client1;
		clientTab[1] = client2;
		clientTab[2] = client3;
		
		
		//pour chaque client dans clientTab
		
		for(Client client : clientTab)
		{
			
			System.out.println("Client : " + "\n");
			System.out.println(client.toString());
			System.out.println(client.getCompteCourant().toString());
			System.out.println(client.getCompteEpargne().toString());
			System.out.println("Calculer Avoir Global " + client.calculerAvoirGlobal());
			System.out.println("+-----------------------------------+");

		}
		
		Compte compte1 =  clientTab[0].getCompteCourant();
		Compte compte2 =  clientTab[1].getCompteCourant();
		Compte compte3 =  clientTab[2].getCompteCourant();
		System.out.println(compte1.toString());
		
		compte1.effectuerVirement(compte3, 300.00);
		System.out.println(compte3.getSolde());
	}
}
