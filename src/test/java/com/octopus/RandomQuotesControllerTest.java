package com.octopus;

import com.octopus.repository.AuthorRepository;
import com.octopus.RandomQuotesController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
//@AutoConfigureMockMvc
public class RandomQuotesControllerTest {

    @Autowired
    private AuthorRepository authorRepository;
    
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
}
