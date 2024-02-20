package com.demo.LearningPortal.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.LearningPortal.dto.CategoryDto;
import com.demo.LearningPortal.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	private static final Logger log = LoggerFactory.getLogger(CategoryController.class);
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/findAll")
	public List<CategoryDto> findAllCategory() {
		log.info("List of Categories:");
		return categoryService.getAllCategories();
	}

	@GetMapping("/{categoryId}")
	public CategoryDto findById(@PathVariable("categoryId") Long id) {
		log.info("category of is:");
		return categoryService.getCategoryById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable("id") Long id) {
		log.info("category is deleted");
		categoryService.deleteCategory(id);
	}

	@PostMapping("/createCategory")
	public CategoryDto saveCategory(@RequestBody CategoryDto request) {
		log.info("category is created");
		return categoryService.saveCategory(request);
	}

	@PutMapping("/update/{id}")
	public CategoryDto updateCategory(@RequestBody CategoryDto dto,@PathVariable("id") Long id) {
		log.info("category of this"+id+"is udated");
		return categoryService.updateCategory(dto, id);
	}

}
