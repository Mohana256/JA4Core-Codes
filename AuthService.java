package com.capgemini.lms.serviceimpl;

import java.util.ArrayList;


import java.util.List;
//import java.util.Map;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.lms.entities.Author;
import com.capgemini.lms.service.AuthorService;
//import com.capgemini.lms.dao.AuthorDao;
//import com.capgemini.lms.daoimpl.AuthorDaoimpl;
import com.capgemini.lms.exception.AuthorNotFoundException;
import com.capgemini.lms.repository.AuthorRepository;

@Service
public class AuthService implements AuthorService{
	@Autowired
	AuthorRepository authorRepository;
	
	public Author addAuthorDetails(Author author) throws AuthorNotFoundException{
			 return authorRepository.save(author);
		
	}
	public Author updateAuthorDetails(Author author) throws AuthorNotFoundException {
			return authorRepository.save(author);
	}
	public int deleteAuthorDetails(int authorId) throws AuthorNotFoundException {
		try {
			authorRepository.deleteById(authorId);
			return 1;
		} catch (Exception e) {
			throw new AuthorNotFoundException("The object cannot be null");
		}
	}
	public List<Author> viewAuthorsList() {
		        List<Author> result = new ArrayList<Author>();
		        authorRepository.findAll().forEach(author1 -> result.add(author1));
		        return result;
	}
	
	public Author viewAuthorById(int id) throws AuthorNotFoundException {
		try {
			return authorRepository.findById(id).get();
		}catch(Exception e) {
			throw new AuthorNotFoundException("The object cannot be null");
		}
	}
	

}
