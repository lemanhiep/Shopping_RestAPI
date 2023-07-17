package com.shopping_restapi.payload.category.reponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: lemanhiep
 * @date: 16/07/2023
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryReponse {
    private String categoreName;
    private boolean isDeleted;
    private Long categoryParentId;
}
