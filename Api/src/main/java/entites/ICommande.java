package entites;

import java.util.Date;
import java.util.List;

public interface ICommande {

	public String getIdentifiant();
	
	public void setIdentifiant(String identifiant);

	public List<String> getListeIdVetement();

	public void setListeIdVetement(List<String> listeIdVetement);
	
	public int getPrix();

	public void setPrix(int prix);
	
	public Date getDate();
	
	public void setDate(Date date);
	
}
