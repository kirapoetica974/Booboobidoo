package services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import entites.Vetement;
import exceptions.ExceptionPasEnStock;

public class CommandeServices implements ICommandeServices {

	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	@Override
	public String envoyerCommande(String vetementString, int nbVetement) throws ExceptionPasEnStock {
		Vetement vetement = null;
		String vetementRetourne = null;
		
		try {
			vetement = OBJECT_MAPPER.readValue(vetementString, Vetement.class);
			
			int quantite = (vetement.getQuantite()) - nbVetement;
			
	        if (0 > quantite) {
	            throw new ExceptionPasEnStock("Pas assez de vetement");
	        } else {
	        	vetement.setQuantite(quantite);
	        }
			
	        vetementRetourne = OBJECT_MAPPER.writeValueAsString(vetement);
	        
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
        return vetementRetourne;
	}
	
}
