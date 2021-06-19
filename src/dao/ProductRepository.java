package dao;

import entity.product.FoodCategory;
import entity.product.Product;
import exceptions.ProductExistsException;
import servicepack.ProductServiceImpl;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository {
    List<Product> productList = new ArrayList<>();
    void save(Product product);
    List<Product> findAll();
    Product findById(int id);
    Product findByName(String  name);
    void update(int id,double volume);
    void update(int id, FoodCategory category);
    void delete(int id);



    final ProductRepository productRepository;
    public  ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }



}
