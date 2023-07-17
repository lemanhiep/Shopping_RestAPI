package com.shopping_restapi.entities;

/**
 * @author: lemanhiep
 * @date: 13/07/2023
 **/
//

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class ProductEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    private String description;

    private String image;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "vote_average")
    private Float voteAverage;

    @Column(name = "is_active")
    private Boolean isActive;

    @Column(name = "is_completed")
    private Boolean isCompleted;

}
