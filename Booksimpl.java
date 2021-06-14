package com.capgemini.lms.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capgemini.lms.entities.Books;
import com.capgemini.lms.exception.BookNotFoundException;
import com.capgemini.lms.repository.BooksRepository;
import com.capgemini.lms.service.BooksService;


@Service
public class Booksimpl implements BooksService{
	@Autowired
	BooksRepository br;

	@Override
		public int addBook(Books book) throws BookNotFoundException {
			// TODO Auto-generated method stub
			try {
				br.save(book);
			}catch(Exception e) {
				throw new BookNotFoundException("The passed object cannot be null");
			}
			return 0;
		
	}

	@Override
	public int updateBookDetails(Books book) throws BookNotFoundException {
		try {
		br.save(book);
		}catch (Exception e) {
			throw new BookNotFoundException("The object cannot be null");	
		}
		return 0;
	}

	@Override
	public int removeBook(int bookid) throws BookNotFoundException {
		try {
			br.deleteById(bookid);
		} catch (Exception e) {
			throw new BookNotFoundException("The object cannot be null");
		}
		return 0;
	}

	@Override
	public List<Books> searchBookByTitle(String keyword) throws BookNotFoundException{
		try {
			return br.searchBookByTitle(keyword);
		}catch(Exception e) {
			throw new BookNotFoundException("Not Found");
		}
		
	}

	@Override
	public List<Books> searchBookBySubject(String keyword) throws BookNotFoundException {
		try {
		return br.searchBookBySubject(keyword);		
		}catch(Exception e) {
			throw new BookNotFoundException("Not Found");
		}
		
	}
	@Override
	public List<Books> viewAllBooks() {
		List<Books> result = new ArrayList<Books>();
        br.findAll().forEach(book1 -> result.add(book1));
        return result;
	}

}
