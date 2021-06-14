package com.capgemini.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.capgemini.lms.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

	//int getAuthorDeatils(Author author);

	//Author viewAuthorById(int id);

	//int updateAuthorDetails(Author author);
	
	//List<Author> getAll();

	

}
