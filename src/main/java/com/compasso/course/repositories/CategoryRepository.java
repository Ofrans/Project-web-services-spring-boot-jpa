package com.compasso.course.repositories;

import com.compasso.course.entities.Category;
import com.compasso.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {



}
