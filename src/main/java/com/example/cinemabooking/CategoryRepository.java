package com.example.cinemabooking;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotBlank;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByCategoryName(@NotBlank String categoryName);
}
