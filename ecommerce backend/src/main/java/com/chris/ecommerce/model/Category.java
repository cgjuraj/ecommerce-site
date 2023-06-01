package com.chris.ecommerce.model;


import jakarta.persistence.*;


@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_name")
//    private @NotBlank String categoryName;

    private String description;

    private String imageUrl;
}
