package com.devzeus.demo_springboot.services;

import com.devzeus.demo_springboot.entities.Category;
import com.devzeus.demo_springboot.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public boolean createCategory(Category category) {
        Category cate = categoryRepository.save(category);
        return cate != null;
    }

    @Override
    public boolean updateCategory(Category category) {
        return false;
    }

    @Override
    public void deleteCategory(Long id) {

    }
}
