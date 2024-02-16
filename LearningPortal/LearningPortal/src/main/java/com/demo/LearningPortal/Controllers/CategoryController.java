package com.demo.LearningPortal.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.LearningPortal.Entities.CategoryEntity;
import com.demo.LearningPortal.Service.CategoryService;
import com.demo.LearningPortal.dto.CategoryDto;


@RestController
@RequestMapping("/Category")
public class CategoryController {

	   @Autowired
	    private CategoryService categoryService;
	   
	   @PostMapping("/createCategory")
	   public ResponseEntity<String> createcategory(@RequestBody CategoryDto categorydto) {
		   categoryService.createCategory(categorydto);
			return ResponseEntity.status(HttpStatus.CREATED).body("Category got created");
		}

	    @PutMapping("/update")
	    public CategoryEntity updateCategory(@RequestBody CategoryEntity category) {
	        return categoryService.updatecategory(category);
	    }

	    @DeleteMapping("/delete/{categoryId}")
	    public void deleteCategory(@PathVariable Long categoryId) {
	    	categoryService.deleteCategory(categoryId);
	    }

	    @GetMapping("/{categoryId}")
	    public CategoryEntity getCategoryById(@PathVariable Long categoryId) {
	        return categoryService.getCategoryById(categoryId);
	    }

	    @GetMapping("/all")
	    public List<CategoryEntity> getAllCategory() {
	        return categoryService.findAllCategories();
	    }
}
