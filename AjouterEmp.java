
package controleur;
import DAO.EmployeDao;
import entite.Employer;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class AjouterEmp {
     private EmployeDao employeDao = new EmployeDao();
    
    public void AjouterEmp( String nom, String prenom, String carteId, String fonction, Date dateNaissance, String numeroTel, String sexe) {
        // Créer un nouvel employé avec les informations fournies
        Employer employe = new Employer( nom, prenom, carteId, fonction, dateNaissance, numeroTel, sexe);
        
        // Ajouter l'employé à la base de données via le DAO
        try {
            employeDao.ajouter(employe);
            System.out.println("Employé ajouté avec succès !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout de l'employé : " + e.getMessage());
        }
    }
}
