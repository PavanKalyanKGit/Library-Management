package LibraryMainPackage.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Library")
public class Library {
@Id
    @Column(name="BOOk Id")
	 long bookid;

     @Column(name="BOOk Name")
	 String bookname;
     
     @Column(name="Author Name")
	 String authorname;
     
     @Column(name="Number of Pages")
	 int pages;
     
     @Column(name="BOOk Price")
	 int price;
     

 	public  Library() {
 		super();
 	}
 	   public Library(long bookid, String bookname, String authorname, int pages, int price) {
 		super();
 		this.bookid = bookid;
 		this.bookname = bookname;
 		this.authorname = authorname;
 		this.pages = pages;
 		this.price = price;
 	}
     
	public long getBookid() {
		return bookid;
	}
	public void setBookid(long bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
