package configurations;

import org.bson.Document;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;

public class ConfigurationEntrepot {

    @Bean(name = "mgClient")
    public MongoClient mgClient() {
        MongoClientURI mongoClientURI = new MongoClientURI("mongodb://Boutique:boutique1@ds113608.mlab.com:13608/fournisseur");
        
        return new MongoClient(mongoClientURI);
    }


    @DependsOn("mgClient")
    @Bean(name = "vetementCollection")
    public MongoCollection<Document> vetementCollection() {
        MongoCollection<Document> mgCollection;
        mgCollection= mgClient().getDatabase("fournisseur").getCollection("Vetement").withDocumentClass(Document.class);
        
        return mgCollection;
    }
}
