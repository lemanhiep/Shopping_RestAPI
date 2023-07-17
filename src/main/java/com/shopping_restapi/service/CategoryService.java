package com.shopping_restapi.service;

import com.shopping_restapi.entities.CategoryEntity;
import com.shopping_restapi.payload.category.request.CategoryRequestCreate;

import java.util.List;
import java.util.Optional;

/**
 * @author: lemanhiep
 * @date: 13/07/2023
 **/
public interface CategoryService {
    CategoryEntity create(CategoryRequestCreate request);
    List<CategoryEntity> findAll();

    Optional<CategoryEntity> findById(Long id);
    Integer deleteById(Long id);

}
