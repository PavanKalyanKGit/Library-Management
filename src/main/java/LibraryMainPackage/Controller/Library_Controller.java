package LibraryMainPackage.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;	
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import LibraryMainPackage.Entities.Library;
import LibraryMainPackage.Service.Library_Service_interface;
@Controller
public class Library_Controller {
	@Autowired
	 Library_Service_interface library_Service_interface;
	
@PostMapping("/addnew")
public String addBook(Library lib)
{
	library_Service_interface.addBook(lib);
	return "index";
}

@PostMapping("/updateexisting")
public String updateBook(Library lib)
{
	library_Service_interface.updateBook(lib);
	return "index";
}

@PostMapping("/deleteexisting")
public String deletebook(long bookid)
{
	library_Service_interface.deletebook(bookid);
	return "index";
}

@PostMapping("/searchexisting")
public String searchBook(long bookid , Model mod)
{
	Library l=library_Service_interface.searchBook(bookid);
	mod.addAttribute("libraries",l);
	return "displaybook";
}

@GetMapping("/viewallexisting")
public String viewbooks(Model mod)
{
	List<Library>liblist = library_Service_interface.viewbooks();
	mod.addAttribute("view",liblist);
	return "viewall";
}
}


