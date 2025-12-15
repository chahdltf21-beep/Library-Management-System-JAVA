package com.knf.dev.librarymanagementsystem.service;

import java.util.List;
import com.knf.dev.librarymanagementsystem.entity.Category;

public interface CategoryService {

    //@ ensures \result != null; // Postcondition: list of categories should not be null
    public List<Category> findAllCategories();

    //@ requires id > 0; // Precondition: category ID must be a positive number
    //@ ensures \result != null; // Postcondition: the result should not be null
    public Category findCategoryById(Long id);

    //@ requires category != null; // Precondition: category must not be null
    //@ ensures \result == true; // Postcondition: the category is created successfully
    public void createCategory(Category category);

    //@ requires category != null && category.getId() > 0; // Precondition: category must not be null and must have a valid ID
    //@ ensures \result == true; // Postcondition: the category is updated successfully
    public void updateCategory(Category category);

    //@ requires id > 0; // Precondition: the category ID must be a positive number
    //@ ensures \result == true; // Postcondition: the category is deleted successfully
    public void deleteCategory(Long id);

}
