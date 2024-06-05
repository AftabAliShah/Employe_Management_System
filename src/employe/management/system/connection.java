package employe.management.system;
import java.sql.DriverManager;


import java.sql.*;
import java.sql.SQLException;
public class connection {
	 Connection con;
	Statement statement;
	   private static final String driver = "com.mysql.cj.jdbc.Driver";
	    private static final String DATABASE_NAME = "showroommanagementsystem";
	    private static final String URL = "jdbc:mysql://localhost:3306/";
	    private static final String uid = "root";
	    private static final String pass = "root";
	public connection() {
		
		 try {
	            
	                Class.forName(driver);
	                con = DriverManager.getConnection(URL+ DATABASE_NAME, uid, pass);
	                statement = con.createStatement();
	            
	        }catch (SQLException sqlException){
	            System.out.println("SQl Exception");
	        }catch (ClassNotFoundException exception){
	            System.out.println("Jar File Not Found");
	        }catch (Exception e ){
	            System.out.println(e.getMessage());
	        }
		
	}
}