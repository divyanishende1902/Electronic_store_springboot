package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.dtos.CategoryDto;
import com.lcwd.electronic.store.dtos.PageableResponse;

import java.util.List;

public interface CategoryService {

    //create
    CategoryDto create(CategoryDto categoryDto);
    //update
    CategoryDto update(CategoryDto categoryDto, String  categoryId);
    //delete
    void delete(String categoryId);

    //getAll
    PageableResponse<CategoryDto> getAllCategory(int pageNumber, int pageSize, String sortBy, String sortDir);

    //getSingleById
    CategoryDto get(String categoryId);


    //search
}
