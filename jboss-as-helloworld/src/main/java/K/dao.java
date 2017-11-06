package K;
import java.util.*;

import Book.Book;
public interface dao 
{	
	public List<Book> getAllBooks();
	public List<Book> getBooksByTitle(String title);
	public List<Book> getBooksByAuthor(String author);
	public List<Book> getBooksLessThanPrice(double price);
	public Book getBookByISBN(String isbn);
	
	public boolean addBook(Book book);
	public boolean updateBook(Book book);
	public boolean deleteBookByISBN(String isbn);
	
}
