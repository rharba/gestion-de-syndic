package entite;

import java.util.Date;

public class EmployerPointer {
    private String nom;
    private String prenom;
    private String carteId;
    private String fonction;
    private Date dateNaissance;
    private String numeroTel;
    private String sexe;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setCarteId(String carteId) {
        this.carteId = carteId;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCarteId() {
        return carteId;
    }

    public String getFonction() {
        return fonction;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public String getSexe() {
        return sexe;
    }

    public String getEtat() {
        return etat;
    }

    public Date getDate() {
        return date;
    }

    public Date getTime() {
        return time;
    }
    private String etat;
    private Date date;
    private Date time;

    // Constructeur
    public EmployerPointer(String nom, String prenom, String carteId, String fonction, Date dateNaissance, String numeroTel, String sexe, String etat, Date date, Date time) {
        this.nom = nom;
        this.prenom = prenom;
        this.carteId = carteId;
        this.fonction = fonction;
        this.dateNaissance = dateNaissance;
        this.numeroTel = numeroTel;
        this.sexe = sexe;
        this.etat = etat;
        this.date = date;
        this.time = time;
    }

    // Getters et setters
    // (Ajoutez-les ici pour chaque champ, similaires aux autres classes)
}
