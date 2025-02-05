package az.developia.librarian.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import az.developia.librarian.entity.Libraryentity;

public class Libraryrepository {
	
	public void add(Libraryentity library) {
	 
	 String query="INSERT INTO library(name,surname,phone,address,username,password) VALUES "
	 		+"('"+library.getName()
	 		+"','"+library.getSurname()
	 		+"','"+library.getPhone()
	 		+"','"+library.getAddress()
	 		+" ,'"+library.getUsername()
	 		+"','"+library.getPassword()+"')";
	try {
		
		Connection conn = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/library_java", "root" , "3306");
		
		Statement st=conn.createStatement();
		
		st.executeUpdate(query);
	
		conn.close();
	}

	catch(Exception e) {
		e.printStackTrace();
	}
 }
}
