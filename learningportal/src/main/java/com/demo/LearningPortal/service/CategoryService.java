package com.demo.LearningPortal.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.LearningPortal.entities.CategoryEntity;
import com.demo.LearningPortal.entities.UserEntity;
import com.demo.LearningPortal.mappers.CategoryMapper;
import com.demo.LearningPortal.Repositories.CategoryRepository;
import com.demo.LearningPortal.dto.CategoryDto;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private CategoryMapper categoryMapper;

      public CategoryDto saveCategory(CategoryDto dto) {
		CategoryEntity entity = categoryMapper.toEntity(dto);
		categoryRepository.save(entity);
        entity.setCreatedOn(LocalDateTime.now());
		entity.setUpdatedOn(LocalDateTime.now());
        return categoryMapper.toDto(entity);
        
	}

	public CategoryDto getCategoryById(Long CategoryId) {
		 Optional<CategoryEntity> categoryOptional = categoryRepository.findById(CategoryId);
		 CategoryEntity category = categoryOptional.get();
		 return categoryMapper.toDto(category);
	}

	public List<CategoryDto> getAllCategories() {
		List<CategoryEntity> entitylist= categoryRepository.findAll();
		return categoryMapper.toDto(entitylist);
	}
	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
	public CategoryDto updateCategory(CategoryDto dto, Long id) {
		Optional<CategoryEntity> checkExistingCategory = categoryRepository.findById(id);
        if (! checkExistingCategory.isPresent())
            throw new RuntimeException("Category Id "+ id + " Not Found!");

        CategoryEntity entity =categoryMapper.toEntity(dto);
        categoryRepository.save(entity);
        entity.setUpdatedOn(LocalDateTime.now());
        return categoryMapper.toDto(entity);
	}
}

	
