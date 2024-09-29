package PracticeBook;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Framework.DriverInit;

public class HansInfoTech extends DriverInit {


	    public static void main(String[] args) throws SQLException {
	        
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Shivam123");

	        if(connection.isClosed()) {
	            System.out.println("We have not connected to the database of HansInfotech");
	        } else {
	            System.out.println("We have successfully connected to the database of HansInfotech");
	        }
	    }
	}


