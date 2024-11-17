
package DAO;
import java.sql.*;
public class DAO {
    private static DAO obj=null;
    private static Connection con=null;
    private DAO(){
        try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_gestionsyndic","root","");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        }
      public static Connection getCon(){
            if(obj==null) obj=new DAO();
            return con;
           }
    }
