package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import services.ICommandeServices;
import entrepot.IEntrepot;
import exceptions.ExceptionPasEnStock;
import exceptions.ExceptionVetementNonTrouve;

@CrossOrigin
@RestController
@RequestMapping(value = "/fournisseur", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class VetementController {

	 @Autowired
	 private IEntrepot iEntrepot;
	 
	 @Autowired
	 private ICommandeServices iCommandeServices;
	
	@RequestMapping(value = "/vetement/{id}", method = RequestMethod.GET)
    @ResponseBody public String getVetementViaId(@PathVariable String id) throws ExceptionVetementNonTrouve {
        try {
            return iEntrepot.rechercher(id);
        } catch (ExceptionVetementNonTrouve e) {
            throw new ExceptionVetementNonTrouve(e);
        }
	}

	@RequestMapping(value = "/commande/{id}/{quantity}", method = RequestMethod.POST)
    @ResponseBody public String commanderVetement(@PathVariable String id ,@PathVariable int quantite) throws ExceptionVetementNonTrouve, ExceptionPasEnStock {
        String vetementString = null;
        try {
        	vetementString = iEntrepot.rechercher(id);
        	
        	iEntrepot.modifier(vetementString);
        	
        } catch (ExceptionVetementNonTrouve e) {
            throw new ExceptionVetementNonTrouve(e);
        }

        try {
        	iCommandeServices.envoyerCommande(vetementString, quantite);
        } catch (ExceptionPasEnStock e) {
            throw new ExceptionPasEnStock("Plus en stock");
        }

        return "Commande effectuee";
	}
}