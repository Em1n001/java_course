package az.developia.Library;

import az.developia.librarian.entity.Libraryentity;
import az.developia.librarian.repository.Libraryrepository;

public class LibraryMain {
	
public static void main(String[] args) {
	
		
	Libraryentity librarian = new Libraryentity(0, "Emin", "Guliyev","050" ,"Baku", "E", "1234");
		
			Libraryrepository repo = new Libraryrepository();
		repo.add(librarian);
	}
}
