package com.lcwd.electronic.store.dtos;

import com.lcwd.electronic.store.entities.Category;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductDto {

        private String productId;
        private String title;
        private String description;
        private int price;
        private int discountedPrice;
        private int quantity;
        private Date addDate;
        private boolean live;
        private boolean stock;
        private CategoryDto category;
        private String productImageName;


}


