package com.shopping_restapi.payload.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: lemanhiep
 * @date: 16/07/2023
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryUpdate {
    private Long id;
    private String categoreName;
    private boolean isDeleted;
    private Long categoryParentId;
    private Boolean isActive;
}
