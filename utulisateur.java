package entite;

public class utulisateur {
    private String nom;
    private String prenom;
    private String id;
    private String pwd;
    private String pwdconf;
    private String genre;
    private String fonction;

    // Constructeur avec tous les attributs
    public utulisateur(String nom, String prenom, String id, String pwd, String pwdconf, String sexe, String fonction) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.pwd = pwd;
        this.pwdconf = pwdconf;
        this.genre = sexe;
        this.fonction = fonction;
    }

    // Getters et Setters
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwdconf() {
        return pwdconf;
    }

    public void setPwdconf(String pwdconf) {
        this.pwdconf = pwdconf;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
}
