package com.shopping_restapi.payload.category.request;

import lombok.Data;

/**
 * @author: lemanhiep
 * @date: 13/07/2023
 **/
@Data
public class CategoryRequestCreate {
    private String categoryName;

    private Long categoryParentId;
}
