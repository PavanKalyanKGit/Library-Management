package LibraryMainPackage.Service;
import java.util.List;


import LibraryMainPackage.Entities.Library;
public interface Library_Service_interface {
	     String addBook(Library lib);
		 String updateBook(Library lib);
		 Library searchBook(long bookid);
		 List<Library> viewbooks();
		 String deletebook(long bookid);
		
	}

