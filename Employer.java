
package entite;

import java.io.InputStream;
import java.util.Date;

public class Employer {
  
    private String nom;
    private String prenom;
    private String carteId;
    private String fonction;
    private Date dateNaissance;
    private String numeroTel;
    private String sexe;
   
 

    // Constructeur
    public Employer(String nom, String prenom, String carteId, String fonction, Date dateNaissance, String numeroTel, String sexe) {
       
        this.nom = nom;
        this.prenom = prenom;
        this.carteId = carteId;
        this.fonction = fonction;
        this.dateNaissance = dateNaissance;
        this.numeroTel = numeroTel;
        this.sexe = sexe;
        
    }

    

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

    public String getCarteId() {
        return carteId;
    }

    public void setCarteId(String carteId) {
        this.carteId = carteId;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    
}

