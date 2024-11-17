
package DAO;
import entite.Employer;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeDao {
    public EmployeDao() {
    }
    public void ajouter(Employer employe) throws SQLException {
        String query = "INSERT INTO employer ( nom, prenom, carteId, fonction, dateNais, numeroTele, sexe) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = DAO.getCon().prepareStatement(query) ;
        statement.setString(1, employe.getNom());
        statement.setString(2, employe.getPrenom());
        statement.setString(3, employe.getCarteId());
        statement.setString(4, employe.getFonction());
        statement.setDate(5, (Date) employe.getDateNaissance());
        statement.setString(6, employe.getNumeroTel());
        statement.setString(7, employe.getSexe());
        statement.executeUpdate();
        
    }
    public static List<Employer> liste() throws SQLException {
        List<Employer> employes = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        // Préparer votre requête SQL pour récupérer la liste des employés
        String sql = "SELECT * FROM employer";
        stmt = DAO.getCon().prepareStatement(sql);

        // Exécuter la requête
        rs = stmt.executeQuery();

        // Parcourir les résultats et ajouter chaque employé à la liste
        while (rs.next()) {
            Employer employe = new Employer(
                rs.getString("nom"),
                rs.getString("prenom"),
                rs.getString("carteId"),
                rs.getString("fonction"),
                rs.getDate("dateNais"),
                rs.getString("numeroTele"),
                rs.getString("sexe")
            );
            employes.add(employe);
        }

        
        return employes;
    }
    public static void supprimer(String carteId) throws SQLException {
        PreparedStatement stmt = null;
        String sql = "DELETE FROM employer WHERE carteId = ?";
        stmt = DAO.getCon().prepareStatement(sql);
        stmt.setString(1, carteId);
        stmt.executeUpdate();
        
    }
}


