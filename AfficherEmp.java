
package controleur;
import DAO.AfficherDao;
import DAO.EmployeDao;
import entite.Employer;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AfficherEmp {
    
    public void afficherEmployesDansTable() {
        // Appeler la méthode getListeEmployes() de la classe AfficherDao pour obtenir la liste des employés
        List<Employer> employes = AfficherDao.getListeEmployes();
        
        
    }}