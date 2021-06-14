package com.capgemini.lms.service;

	import java.util.List;

	import com.capgemini.lms.entities.Books;
    import com.capgemini.lms.exception.BookNotFoundException;

	public interface BooksService {
		public int addBook(Books book) throws BookNotFoundException;
		public int updateBookDetails(Books book) throws BookNotFoundException;
		public int removeBook(int bookid) throws BookNotFoundException;
		public List<Books> searchBookByTitle(String keyword) throws BookNotFoundException;
		public List<Books> searchBookBySubject(String keyword) throws BookNotFoundException;
		public List<Books> viewAllBooks();
	}



