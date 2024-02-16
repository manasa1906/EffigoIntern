package com.demo.LearningPortal.Mapper;

import com.demo.LearningPortal.Entities.CategoryEntity;
import com.demo.LearningPortal.dto.CategoryDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-16T20:14:53+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240129-0421, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDto categoryEntityTocategoryDto(CategoryEntity category) {
        if ( category == null ) {
            return null;
        }

        CategoryDto categoryDto = new CategoryDto();

        categoryDto.setCategoryId( String.valueOf( category.getCategoryId() ) );
        categoryDto.setName( category.getName() );

        categoryDto.setCreatedOn( dateTimeformatter.formatTimestamp(user.getCreatedOn()) );
        categoryDto.setUpdatedOn( dateTimeformatter.formatTimestamp(user.getupdatedOn()) );

        return categoryDto;
    }

    @Override
    public CategoryEntity categoryDtoTocategoryEntity(CategoryDto category) {
        if ( category == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setCreatedOn( category.getCreatedOn() );
        categoryEntity.setUpdatedOn( category.getUpdatedOn() );
        categoryEntity.setName( category.getName() );
        if ( category.getCategoryId() != null ) {
            categoryEntity.setCategoryId( Long.parseLong( category.getCategoryId() ) );
        }

        return categoryEntity;
    }
}
