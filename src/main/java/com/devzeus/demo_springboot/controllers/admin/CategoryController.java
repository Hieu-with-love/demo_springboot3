package com.devzeus.demo_springboot.controllers.admin;

import com.devzeus.demo_springboot.entities.Category;
import com.devzeus.demo_springboot.services.ICategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final ICategoryService categoryService;

    @GetMapping("")
    public String showListCategory(Model model) {
        List<Category> categoryList = categoryService.findAllCategories();
        model.addAttribute("categoryList", categoryList);
        return "admin/categories/list";
    }

    @GetMapping("/create")
    public String showAddCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "admin/categories/add-category";
    }

    @PostMapping("/create")
    public String addCategory(@ModelAttribute("name") String name
                            , @ModelAttribute("image") String image
                            , @ModelAttribute("status") String status) {
        int my_status = 1;
        if (status.equals("active")) {
            my_status = 1;
        }else{
            my_status = 0;
        }
        Category category = Category.builder()
                .name(name)
                .image(image)
                .status(my_status)
                .build();
        categoryService.createCategory(category);
        return "redirect:/admin/categories";
    }


}
