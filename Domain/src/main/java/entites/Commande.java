package entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commande implements ICommande {

	private String identifiant;
	
	private List<String> listeIdVetement = new ArrayList<String>();
	
	private int prix;
	
	private Date date;

	public Commande(String identifiant, List<String> listeIdVetement, int prix, Date date) {
		super();
		this.identifiant = identifiant;
		this.listeIdVetement = listeIdVetement;
		this.prix = prix;
		this.date = date;
	}

	@Override
	public String getIdentifiant() {
		return identifiant;
	}
	
	@Override
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	@Override
	public List<String> getListeIdVetement() {
		return listeIdVetement;
	}

	@Override
	public void setListeIdVetement(List<String> listeIdVetement) {
		this.listeIdVetement = listeIdVetement;
	}

	@Override
	public int getPrix() {
		return prix;
	}

	@Override
	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public Date getDate() {
		return date;
	}

	@Override
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
    public String toString() {
        return "Commande{" +
                "identifiant=" + identifiant +
                ", date=" + date +
                ", prix=" + prix +
                '}';
	}
}
