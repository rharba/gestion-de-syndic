package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SupprimerEmpDAO {
    
    public static void supprimerEmpDao(String carteId) {
        PreparedStatement stmt = null;
        
        try {
            
            String sql = "DELETE FROM employer WHERE carteId = ?";
            stmt = DAO.getCon().prepareStatement(sql);
                        stmt.setString(1, carteId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
           
        } finally {
           
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
                
            }
        }
    }
}
