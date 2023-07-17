package com.shopping_restapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: lemanhiep
 * @date: 13/07/2023
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class CategoryEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "is_deleted")
    private boolean isDeleted ;

    @Column(name = "category_parent_id")
    private Long categoryParentId;

    @Column(name = "is_active")
    private boolean isActive = true;


}
