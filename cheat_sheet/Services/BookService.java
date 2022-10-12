
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service
public class BookService {

	public final BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	 // returns all the books
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    
    // creates a book
    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
    
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // edits a book
    public Book editBook(Book book) {	
    	return bookRepo.save(book);
    	
    }
    
    // Delete a Book
    
    public void deleteBook(Long id) {
    	bookRepo.deleteById(id);
    }
		

}
