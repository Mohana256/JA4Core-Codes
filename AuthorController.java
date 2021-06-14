package com.capgemini.lms.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.capgemini.lms.entities.Author;
import com.capgemini.lms.exception.AuthorNotFoundException;
import com.capgemini.lms.serviceimpl.AuthService;


@RestController
public class AuthorController{
	@Autowired
	AuthService as;
	@GetMapping("/getAuthor")
	private List<Author> viewAuthorsList(){
		return as.viewAuthorsList();
	}
	@DeleteMapping("/author/{authorId}")
	private int deleteAuthorDetails(@PathVariable("authorId") int authorId) throws AuthorNotFoundException{
		 as.deleteAuthorDetails(authorId);
		 return authorId; 
	}
	@GetMapping("/getAuthor/{id}")
	private Author viewAuthorById(@PathVariable("id") int id) throws AuthorNotFoundException {
		 as.viewAuthorById(id);
		 return null;
	}
	@PostMapping("/postAuthor")
	private int saveAuthor(@RequestBody Author author) throws AuthorNotFoundException {
		as.addAuthorDetails(author);
		return author.getAuthorId();
	}
	@PutMapping("/update")
	private Author update(@RequestBody Author author) throws AuthorNotFoundException {
		as.updateAuthorDetails(author);
		return author;
	}
	
}