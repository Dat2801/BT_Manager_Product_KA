package com.codegym.service.product;

import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.service.IService;

import java.util.List;

public interface IProductService extends IService<Product> {
     List<Product> findTop5Price();
     List<Product> findTop5New();
     List<Product> findProductByCategoryName(Category category);

}
