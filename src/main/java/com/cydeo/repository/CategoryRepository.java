package com.cydeo.repository;

import com.cydeo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    //Write a derived query to get category by name
    @Query("select c from Category c where c.name=?1")
    List<Category> retrieveByCategoryName(String categoryName);
    //Write a derived query to get top 3 categories order by name desc
    List<Category> getTop3ByOrderByNameDesc();
}
