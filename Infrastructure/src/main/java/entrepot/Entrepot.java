package entrepot;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;

import com.mongodb.client.MongoCollection;

import exceptions.ExceptionVetementNonTrouve;

import static com.mongodb.client.model.Filters.eq;

public class Entrepot implements IEntrepot {

	@Autowired
	private MongoCollection<Document> collectionVetement;
	
	@Override
	public String rechercher(String idVetement) throws ExceptionVetementNonTrouve{
		Document document = collectionVetement.find(eq("identifiant", idVetement)).first();

        String documentString;
        if (null != document) {
            document.remove("_id");
            documentString = document.toJson();
        } else {
            throw new ExceptionVetementNonTrouve("Produit non trouve avec cet id : " + idVetement);
        }
        return documentString;
	}

	@Override
	public void ajouter(String vetement) {
	
	}

	@Override
	public void supprimer(String idVetement) throws ExceptionVetementNonTrouve {
		
		 String vetement = null;
		 vetement = rechercher(idVetement);
	     if (null == vetement) {
	         throw new ExceptionVetementNonTrouve("Impossible de supprimer");
	     } 
	     else {
	          collectionVetement.deleteOne(Document.parse(vetement));
	     }
		
	}

	@Override
	public void modifier(String vetement) throws ExceptionVetementNonTrouve {
		Document document = Document.parse(vetement);
		supprimer(document.getString("identifiant"));
        collectionVetement.insertOne(document);
	}

}
