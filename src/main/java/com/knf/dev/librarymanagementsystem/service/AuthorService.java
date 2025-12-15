package com.knf.dev.librarymanagementsystem.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.knf.dev.librarymanagementsystem.entity.Author;

public interface AuthorService {

    //@ ensures \result != null; // Postcondition: list of authors should not be null
    public List<Author> findAllAuthors();

    //@ requires id > 0; // Precondition: author ID must be a positive number
    //@ ensures \result != null; // Postcondition: the result should not be null
    public Author findAuthorById(Long id);

    //@ requires author != null; // Precondition: author must not be null
    //@ ensures \result == true; // Postcondition: the author is created successfully
    public void createAuthor(Author author);

    //@ requires author != null && author.getId() > 0; // Precondition: author must not be null and must have a valid ID
    //@ ensures \result == true; // Postcondition: the author is updated successfully
    public void updateAuthor(Author author);

    //@ requires id > 0; // Precondition: the author ID must be a positive number
    //@ ensures \result == true; // Postcondition: the author is deleted successfully
    public void deleteAuthor(Long id);

    //@ requires pageable != null; // Precondition: pageable object must not be null
    //@ ensures \result != null; // Postcondition: paginated result should not be null
    public Page<Author> findPaginated(Pageable pageable);

}
