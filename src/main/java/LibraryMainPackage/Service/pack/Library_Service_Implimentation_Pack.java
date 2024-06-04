package LibraryMainPackage.Service.pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LibraryMainPackage.Entities.Library;
import LibraryMainPackage.Repositories.Library_Repositry_Interface;
import LibraryMainPackage.Service.Library_Service_interface;
@Service
public class Library_Service_Implimentation_Pack implements Library_Service_interface {

	@Autowired
	private Library_Repositry_Interface  library_repositry_interface;
	
	

	@Override
	public String addBook(Library lib) {
		library_repositry_interface.save(lib) ;
		return "Successfully data Saved";
	}

	@Override
	public String updateBook(Library lib) {
		library_repositry_interface.save(lib) ;
		return "Successfully Updated data Saved";
	}

	@Override
	public Library searchBook(long bookid) {
		return library_repositry_interface.findById(bookid).get();
		
	}

	@Override
	public List<Library> viewbooks() {
		return library_repositry_interface.findAll() ;
	}

	@Override
	public String deletebook(long bookid) {		
		
		library_repositry_interface.deleteById(bookid);
		return "Deleted Successfully";
	}

}
