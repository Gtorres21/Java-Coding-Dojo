// Create a services package named services of src/main/java/com/giovanni/projName
//Create a class 

import org.springframework.stereotype.Service;
import com.codingdojo.mvc.models.Book;
@Service
public class BookService {

    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // edits a book
    public Book editBook(Book book) {	
    	return bookRepository.save(book);
    	
    }
    
    // Delete a Book
    
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
	
	

}

return ninjaRepo.findByDojoIdIs(dojoId);