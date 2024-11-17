package DAO;

import entite.Employer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AfficherDao {
    
    // Méthode pour obtenir la liste des employés depuis la base de données
    public static List<Employer> getListeEmployes() {
        List<Employer> employes = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            // Initialiser votre connexion à la base de données
             
            
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
        } catch (SQLException e) {
            e.printStackTrace();
            // Gérer les exceptions
        } finally {
            // Fermer les ressources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Gérer les exceptions de fermeture des ressources
            }
        }
        
        return employes;
    }
}
