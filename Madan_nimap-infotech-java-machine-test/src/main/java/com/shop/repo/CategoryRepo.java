package com.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.entity.Category;
@Repository
public interface CategoryRepo extends JpaRepository<Category,Long>{
}
