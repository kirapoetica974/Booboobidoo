package services;

import exceptions.ExceptionPasEnStock;


public interface ICommandeServices {

	//On enlève les objets du stock
	public String envoyerCommande(String vetementString, int nbVetement) throws ExceptionPasEnStock;
	
}
