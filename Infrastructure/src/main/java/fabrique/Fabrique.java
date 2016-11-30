package fabrique;

import java.util.Date;
import java.util.List;

import entites.Commande;
import entites.Vetement;

public class Fabrique implements IFabrique {

	@Override
	public Vetement creerVetement(String identifiant, String nom, String description,
			String couleur, int prix) {
		Vetement vetement = new Vetement(identifiant, nom, description, couleur, prix);
		return vetement;
	}

	@Override
	public Commande creerCommande(String identifiant,
			List<String> listeIdVetement, int prix, Date date) {
		Commande commande = new Commande(identifiant, listeIdVetement, prix, date);
		return commande;
	}

}
