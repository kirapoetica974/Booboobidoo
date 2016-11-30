package services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import entites.Vetement;

public class CommandeServices implements ICommandeServices {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	@Override
	public void recevoirCommande(List<String> listeVetementString) {
		List<Vetement> listeVetement = new ArrayList<Vetement>();
		for(String vetementString : listeVetementString) {
				try {
					listeVetement.add(OBJECT_MAPPER.readValue(vetementString, Vetement.class));
				} catch (JsonParseException e) {
					e.printStackTrace();
				} catch (JsonMappingException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		//Vérifier les stocks
	}

	@Override
	public void envoyerCommande(List<String> listeVetementString) {
		List<Vetement> listeVetement = new ArrayList<Vetement>();
		for(String vetementString : listeVetementString) {
				try {
					listeVetement.add(OBJECT_MAPPER.readValue(vetementString, Vetement.class));
				} catch (JsonParseException e) {
					e.printStackTrace();
				} catch (JsonMappingException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		//Enlever du stock
	}
	
}
