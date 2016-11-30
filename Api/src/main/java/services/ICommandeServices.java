package services;

import java.util.List;

public interface ICommandeServices {

	//On vérifie les objets demandé et on fabrique si besoin
	public void recevoirCommande(List<String> identifiant);

	//On enlève les objets du stock
	public void envoyerCommande(List<String> identifiant);
	
}
