package com.sky.service;

import com.sky.dto.CategoryDTO;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import com.sky.result.PageResult;

import java.util.ArrayList;

public interface CategoryService {
    PageResult getPage(CategoryPageQueryDTO categoryPageQueryDTO);

    void updateStatus(long id, Integer status);

    void delete(long id);

    void insert(CategoryDTO categoryDTO);

    ArrayList<Category> selectByType(int i);

    void update(CategoryDTO categoryDTO);
}
