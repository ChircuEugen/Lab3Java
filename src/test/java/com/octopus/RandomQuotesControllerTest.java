package com.octopus;

import com.octopus.repository.AuthorRepository;
import com.octopus.repository.QuoteRepository;
import com.octopus.entity.Author;
import com.octopus.RandomQuotesController;
import org.junit.jupiter.api.Test;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class RandomQuotesControllerTest {

    @Autowired
    private AuthorRepository authorRepository;
    
    @Autowired
    private QuoteRepository quoteRepository;
    
    @Autowired
    private RandomQuotesController test;


    @Test
    public void ensureAuthorsExists() {
        assertTrue(authorRepository.count() != 0);
    }
    
    @Test
    public void ensureVersion() {
        String ver = test.getVersion();
        assertNotNull(ver);
    }
    
    //@Test
    //public void ensureQuotesExists() {
        //assertTrue(quoteRepository.count() < 0);
    //}
    
    //@Test
    //public void checkAuthorExists() {
        //Author ent = new Author();
        //String name = ent.getFirstName();
       // assertEquals("Jonathan", name);
   // }
    @Test
    public void checkID(){
        long id3 = 3;
        Author author = authorRepository.findById(id3);
        assertEquals("Jonathan", author.getFirstName());
    }
}
