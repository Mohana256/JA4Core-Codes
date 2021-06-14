package com.capgemini.lms.test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.capgemini.lms.entities.Author;
import com.capgemini.lms.exception.AuthorNotFoundException;
import com.capgemini.lms.serviceimpl.AuthService;


public class AuthServiceTest extends LibraryManagementSystem2ApplicationTests{
	@Autowired
	AuthService as;
	@Test
	public void testDeleteAuthorDetails() throws AuthorNotFoundException{
		Author np=new Author(20,"Mohana","Neelarapu","ng@gmail.com","7492801");
		 np = as.addAuthorDetails(np);
		 assertEquals(20,as.deleteAuthorDetails(np.getAuthorId()));
	}
	@Test
	public void testViewAuthorsList() {
		List<Author> auth = as.viewAuthorsList();
		assertThat(auth).size().isGreaterThan(0);
	}
	@Test
	public void testAddAuthorDetails() throws AuthorNotFoundException {
		Author auth = new Author(2,"Mohana","Neelarapu","ng@gmail.com","7492801");
		auth = as.addAuthorDetails(auth);
		assertEquals(auth.getFirstName(),"Mohana");
    }
	@Test
	public void testUpdateAuthorDetails() throws AuthorNotFoundException {
		Author auth = new Author(2,"Mohana","Neelarapu","mk@gmail.com","87391301983");
		auth = as.updateAuthorDetails(auth);
		assertEquals(auth.getLastName(), "Neelarapu"); 
		assertEquals(auth.getEmail(),"mk@gmail.com"); 
		
	}
	@Test
	public void testViewAuthorById() throws AuthorNotFoundException {
		Author auth=new Author(20,"Mohana","Neelarapu","mk@gmail.com","87391301983");
		Author np=as.addAuthorDetails(auth);
		assertEquals(np.getAuthorId(),20);
	}
}
