package com.lcwd.electronic.store.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="categories")
public class Category {
    @Id
    @Column(name = "id")
    private String categoryId;

    @Column(name = "category_title", length = 60, nullable = false)
    private String title;

    @Column(name = "category_desc")
    private String description;

    private String coverImage;

    //cascade type if remove kiya to , update kiya to sabhi chiz honi chahiye parent ki child ke sath
    // fetch type using for when category fetching product not get show
    //it only show when required for that fetch type lazy
    @OneToMany(mappedBy ="category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products = new ArrayList<>();
}
