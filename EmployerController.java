
package controleur;
import DAO.AfficherDao;
import DAO.EmployeDao;
import DAO.SupprimerEmpDAO;
import entite.Employer;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class EmployerController {
     private EmployeDao employeDao = new EmployeDao();
    
    public boolean Ajouter(Employer employer) {
        
        // Ajouter l'employé à la base de données via le DAO
        try {
            employeDao.ajouter(employer);
            return true;
        } catch (SQLException e) {
            //afficher sur le log
            return false;
        }
    }
       public void supprimerEmp(String carteId) {
        SupprimerEmpDAO.supprimerEmpDao(carteId);
        
        }
       public void afficherEmployesDansTable() {
        // Appeler la méthode getListeEmployes() de la classe AfficherDao pour obtenir la liste des employés
        List<Employer> employes = AfficherDao.getListeEmployes();
        
        
    }
    }
