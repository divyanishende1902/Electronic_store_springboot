package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.dtos.PageableResponse;
import com.lcwd.electronic.store.dtos.ProductDto;




public interface ProductService {
    //create
    ProductDto create(ProductDto productDto);

    //update
    ProductDto update(ProductDto productDto, String productId);

    //delete
    void delete(String productId);

    //get single
    ProductDto get(String productId);
    //get all
    PageableResponse<ProductDto> getAllProducts(int pageNumber, int pageSize, String sortBy, String sortDir);
    //get all : live
    PageableResponse<ProductDto> getAllLive(int pageNumber, int pageSize, String sortBy, String sortDir);
    //search product
    PageableResponse<ProductDto> serachByTitle(String subTitle, int pageNumber, int pageSize, String sortBy, String sortDir);

    //create product with category
    ProductDto createProductWithCategory(ProductDto productDto, String categoryId);

    ProductDto updateProductWithCategory(ProductDto productDto, String categoryId, String productId);
}
