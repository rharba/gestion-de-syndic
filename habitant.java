
package entite;


public class habitant {
    // Attributs
    private String nom;
    private String prenom;
    private String emeuble;
    private String appartement;

    // Constructeur
    public habitant(String nom, String prenom, String emeuble, String appartement) {
        this.nom = nom;
        this.prenom = prenom;
        this.emeuble = emeuble;
        this.appartement = appartement;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmeuble() {
        return emeuble;
    }

    public void setEmeuble(String emeuble) {
        this.emeuble = emeuble;
    }

    public String getAppartement() {
        return appartement;
    }

    public void setAppartement(String appartement) {
        this.appartement = appartement;
    }

    // Méthode pour afficher les informations de l'habitant
    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Emeuble: " + emeuble);
        System.out.println("Appartement: " + appartement);
    }
}
