package com.devzeus.demo_springboot.services;

import com.devzeus.demo_springboot.entities.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAllCategories();
    boolean createCategory(Category category);
    boolean updateCategory(Category category);
    void deleteCategory(Long id);
}
