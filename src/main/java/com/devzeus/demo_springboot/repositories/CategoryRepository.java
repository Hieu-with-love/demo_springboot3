package com.devzeus.demo_springboot.repositories;

import com.devzeus.demo_springboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByNameContaining(String keyword);
    Category findByName(String name);
}
