package entite;

import java.util.Date;

public class pointer {
   
    private String carteId;
    private String Etat;
    private Date date;
    private Date time;

    // Constructeur avec tous les paramètres
    public pointer(String carteId, String Etat, Date date, Date time) {
       
        this.carteId = carteId;
        this.Etat = Etat;
        this.date = date;
        this.time = time;
    }

    // Getters
 
    public String getCarteId() {
        return carteId;
    }

    public String getEtat() {
        return Etat;
    }

    public Date getDate() {
        return date;
    }

    public Date getTime() {
        return time;
    }

    // Setters

    public void setCarteId(String carteId) {
        this.carteId = carteId;
    }

    public void setEtat(String Etat) {
        this.Etat = Etat;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
