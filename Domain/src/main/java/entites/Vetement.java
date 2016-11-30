package entites;


public class Vetement implements IVetement {

	private String identifiant;
	
	private String nom;
	
	private String description;
	
	private String couleur;

	private int prix;
	
	public Vetement(String identifiant, String nom, String description,
			String couleur, int prix) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.description = description;
		this.couleur = couleur;
		this.prix = prix;
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
	public String getNom() {
		return nom;
	}

	@Override 
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getCouleur() {
		return couleur;
	}

	@Override
	public void setCouleur(String couleur) {
		this.couleur = couleur;
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
    public String toString() {
        return "Vetement{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", couleur=" + couleur +
                ", prix=" + prix +
                '}';
	}
}
