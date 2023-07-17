package com.shopping_restapi.service.impl;

import com.shopping_restapi.entities.CategoryEntity;
import com.shopping_restapi.payload.category.request.CategoryRequestCreate;
import com.shopping_restapi.repository.CategoryRepository;
import com.shopping_restapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author: lemanhiep
 * @date: 13/07/2023
 **/

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public CategoryEntity create(CategoryRequestCreate request) {
        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setCategoryName(request.getCategoryName());
        categoryEntity.setCategoryParentId(request.getCategoryParentId());

        categoryRepository.save(categoryEntity);

        return categoryEntity;
    }

    @Override
    public List<CategoryEntity> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<CategoryEntity> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Integer deleteById(Long id) {
       return    categoryRepository.deleteCategoryById(id);
    }

}
