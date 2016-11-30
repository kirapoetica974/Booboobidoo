package entrepot;

public interface IEntrepot {

	public String rechercher(String idVetement);
	
	public void ajouter(String vetement);
	
	public void supprimer(String idVetement);
	
	public void modifier(String vetement);
}
