package com.shopping_restapi.controller.admin;

import com.shopping_restapi.entities.CategoryEntity;
import com.shopping_restapi.payload.category.CategoryUpdate;
import com.shopping_restapi.payload.category.ListCategoryId;
import com.shopping_restapi.payload.category.reponse.CategoryReponse;
import com.shopping_restapi.payload.category.request.CategoryRequestCreate;
import com.shopping_restapi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * @author: lemanhiep
 * @date: 13/07/2023
 **/

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("create")
    public Object create(@RequestBody CategoryRequestCreate request) {
        return categoryService.create(request);
    }
    @GetMapping("findAll")
    public Object findAll() {
        return categoryService.findAll();
    }


    @DeleteMapping("delete/{categoryid}")
    public ResponseEntity<?> delete(@PathVariable("categoryid") Long id)
    {
        Optional<CategoryEntity> category = categoryService.findById(id);
        if(category.isPresent())
        {
            categoryService.deleteById(id); 
        }
        return ResponseEntity.ok().body("Xoa Thanh cong");
    }
    
    
//    @PutMapping("update")
//    public Object update(@RequestBody CategoryUpdate update)
//    {
//        return categoryService.update(update);
//    }
}
