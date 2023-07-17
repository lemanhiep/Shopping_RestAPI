package com.shopping_restapi.repository;

import com.shopping_restapi.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: lemanhiep
 * @date: 13/07/2023
 **/

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
//    @Query("from CategoryEntity c where c.isDeleted = false") // JPQL query
    @Query(value = "select * from categories c where c.is_deleted = false", nativeQuery = true) //sql
    List<CategoryEntity> findAll();
    @Modifying
    @Query("update CategoryEntity c set c.isDeleted = true where c.id=?1")
    Integer deleteCategoryById(Long id);
}
