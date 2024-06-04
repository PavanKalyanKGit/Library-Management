package LibraryMainPackage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Navigation_Controller {

		@GetMapping("/")
		public String index()
		{
			return"index";
		}
		
		@GetMapping("/addbookpage")
		public String add()
		{
			return"addbook";
		}
		
		
		@GetMapping("/updatebookpage")
		public String update()
		{
			return"updatebook";
		}
		
		@GetMapping("/searchpage")
		public String search()
		{
			return"searchbook";
		}
		
		@GetMapping("/deletepage")
		public String delete()
		{
			return"deletebook";
		}
		
		@GetMapping("/display")
		public String display()
		{
			return"displaybook";
		}
		

		@GetMapping("/viewbutton")
		public String view()
		{
			return"viewall";
		}
		
}
