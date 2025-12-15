package com.knf.dev.librarymanagementsystem.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.knf.dev.librarymanagementsystem.entity.Book;

public interface BookService {

    //@ ensures \result != null; // Postcondition: list of books should not be null
    public List<Book> findAllBooks();

    //@ requires keyword != null; // Precondition: the search keyword must not be null
    //@ ensures \result != null; // Postcondition: list of books should not be null
    public List<Book> searchBooks(String keyword);

    //@ requires id > 0; // Precondition: book ID must be a positive number
    //@ ensures \result != null; // Postcondition: the result should not be null
    public Book findBookById(Long id);

    //@ requires book != null; // Precondition: book must not be null
    //@ ensures \result == true; // Postcondition: the book is created successfully
    public void createBook(Book book);

    //@ requires book != null && book.getId() > 0; // Precondition: book must not be null and must have a valid ID
    //@ ensures \result == true; // Postcondition: the book is updated successfully
    public void updateBook(Book book);

    //@ requires id > 0; // Precondition: the book ID must be a positive number
    //@ ensures \result == true; // Postcondition: the book is deleted successfully
    public void deleteBook(Long id);

    //@ requires pageable != null; // Precondition: pageable object must not be null
    //@ ensures \result != null; // Postcondition: paginated result should not be null
    public Page<Book> findPaginated(Pageable pageable);
}
