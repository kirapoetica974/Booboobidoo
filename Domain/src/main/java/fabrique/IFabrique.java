package fabrique;

import java.util.Date;
import java.util.List;

import entites.Commande;
import entites.Vetement;

public interface IFabrique {
	
	public Vetement creerVetement(String identifiant, String nom, String description,
			String couleur, int prix);
	
	public Commande creerCommande(String identifiant, List<String> listeIdVetement, int prix, Date date);
	
}
