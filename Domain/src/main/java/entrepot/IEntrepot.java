package entrepot;

import exceptions.ExceptionVetementNonTrouve;

public interface IEntrepot {

	public String rechercher(String idVetement) throws ExceptionVetementNonTrouve;
	
	public void ajouter(String vetement);
	
	public void supprimer(String idVetement) throws ExceptionVetementNonTrouve;
	
	public void modifier(String vetement) throws ExceptionVetementNonTrouve;
}
