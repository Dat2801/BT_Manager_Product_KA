package com.codegym.repository;

import com.codegym.model.Category;
import com.codegym.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
    Page<Product> findAllByOrderByIdAsc(Pageable pageable);

    List<Product> findTop5ByOrderByPriceDesc();

    List<Product> findTop5ByOrderByDateTimeDesc();

    @Query(value = "select * " +
            "from product " +
            "where product.name like ?", nativeQuery = true)
    List<Product> findProductName(String name);

//    @Query(value = "select * from product where product.category_id = ?", nativeQuery = true)
//    List<Product> findProductByCategoryName(Category category);
    List<Product> findAllByCategory(Category category);

}
