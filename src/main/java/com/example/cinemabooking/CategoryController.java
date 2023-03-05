package com.example.cinemabooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    public ResponseEntity<List<Category>> getCategories() {
        return new ResponseEntity<>(categoryService.listCategories(), HttpStatus.OK);
    }

}
