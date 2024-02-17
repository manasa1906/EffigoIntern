<<<<<<< HEAD
package com.demo.LearningPortal.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.LearningPortal.Entities.CategoryEntity;

import com.demo.LearningPortal.Mapper.CategoryMapper;
import com.demo.LearningPortal.Repositories.CategoryRepository;
import com.demo.LearningPortal.dto.CategoryDto;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	/*
	 * @Autowired private CategoryMapper categoryMapper;
	 */
	
	public CategoryEntity saveCategory(CategoryEntity category)
	{
		return categoryRepository.save(category);
	}

	public CategoryEntity getCategoryById(long categoryId)
	{
		return categoryRepository.findById(categoryId).orElse(null);
	}
	public List<CategoryEntity> findAllCategories()
	{
		return categoryRepository.findAll();
	}

	public void createCategory(CategoryDto categorydto) {
		CategoryEntity courseEntity=CategoryMapper.MAPPER.categoryDtoTocategoryEntity(categorydto);
		categoryRepository.save(courseEntity);
		
	}

	public CategoryEntity updatecategory(CategoryEntity category) {
		CategoryEntity existingCategory = categoryRepository.findById(category.getCategoryId()).orElse(null);
		if (existingCategory != null) {
			existingCategory.setName(category.getName());

			existingCategory.setUpdatedOn(LocalDateTime.now());

			return categoryRepository.save(existingCategory);
		} else {

			throw new IllegalArgumentException("Category with ID " + category.getCategoryId() + " not found");
		}
	}

	public void deleteCategory(Long categoryId) {
		Optional<CategoryEntity> existingCategory = categoryRepository.findById(categoryId);
        if (!existingCategory.isPresent()) {
            throw new IllegalArgumentException("Category with ID " + categoryId + " not found.");
        }
     categoryRepository.deleteById(categoryId);
	
		
	}
}
=======
package com.demo.LearningPortal.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.LearningPortal.Entities.CategoryEntity;

import com.demo.LearningPortal.Mapper.CategoryMapper;
import com.demo.LearningPortal.Repositories.CategoryRepository;
import com.demo.LearningPortal.dto.CategoryDto;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	/*
	 * @Autowired private CategoryMapper categoryMapper;
	 */
	
	public CategoryEntity saveCategory(CategoryEntity category)
	{
		return categoryRepository.save(category);
	}

	public CategoryEntity getCategoryById(long categoryId)
	{
		return categoryRepository.findById(categoryId).orElse(null);
	}
	public List<CategoryEntity> findAllCategories()
	{
		return categoryRepository.findAll();
	}

	public void createCategory(CategoryDto categorydto) {
		CategoryEntity courseEntity=CategoryMapper.MAPPER.categoryDtoTocategoryEntity(categorydto);
		categoryRepository.save(courseEntity);
		
	}

	public CategoryEntity updatecategory(CategoryEntity category) {
		CategoryEntity existingCategory = categoryRepository.findById(category.getCategoryId()).orElse(null);
		if (existingCategory != null) {
			existingCategory.setName(category.getName());

			existingCategory.setUpdatedOn(LocalDateTime.now());

			return categoryRepository.save(existingCategory);
		} else {

			throw new IllegalArgumentException("Category with ID " + category.getCategoryId() + " not found");
		}
	}

	public void deleteCategory(Long categoryId) {
		Optional<CategoryEntity> existingCategory = categoryRepository.findById(categoryId);
        if (!existingCategory.isPresent()) {
            throw new IllegalArgumentException("Category with ID " + categoryId + " not found.");
        }
     categoryRepository.deleteById(categoryId);
	
		
	}
}
>>>>>>> aea42ef8228639dacf311d0230d00b4371719e8e
