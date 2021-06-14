package com.capgemini.lms.controller;
	import java.util.ArrayList;

    import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.ui.Model;

//import org.springframework.http.MediaType;

	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
    //import org.springframework.web.bind.annotation.ModelAttribute;
    import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;

	import org.springframework.web.bind.annotation.RestController;

	import com.capgemini.lms.entities.Books;
	import com.capgemini.lms.exception.BookNotFoundException;
    import com.capgemini.lms.serviceimpl.Booksimpl;
	

	@RestController
	public class BooksController{
		@Autowired
		Booksimpl bs;
		
		@GetMapping("/getBooks")
		private List<Books> viewAllBooks(){
			return bs.viewAllBooks();
		}
		@DeleteMapping("/deleteBook/{bookid}")
		private void removeBook(@PathVariable("bookid") int bookid) throws BookNotFoundException{
			 bs.removeBook(bookid);
		}
		@PostMapping("/postBooks")
		private int saveBook(@RequestBody Books book) throws BookNotFoundException {
			bs.addBook(book);
			return book.getBookid();
		}
		@GetMapping("/getSubject/{subject}")
		private List<Books> searchBookBySubject(@PathVariable("subject") String keyword) throws BookNotFoundException{
			return bs.searchBookBySubject(keyword);
		}
		@GetMapping("/getTitle/{title}")
		private List<Books> searchBookByTitle(@PathVariable("title") String keyword) throws BookNotFoundException{
			return bs.searchBookByTitle(keyword);
		}
		
		@PutMapping("/updateBooks")
		private Books update(@RequestBody Books book) throws BookNotFoundException {
			bs.updateBookDetails(book);
			return book;
		}
		
	}


