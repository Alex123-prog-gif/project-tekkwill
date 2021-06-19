package service;

import app.ProductManagement;
import app.ProductManagementImpl;
import dao.InMemoryProductRepository;
import dao.ProductRepository;
import entity.product.FoodCategory;
import entity.product.Product;
import servicepack.ProductService;
import servicepack.ProductServiceImpl;

import java.util.Scanner;

public class ProductManagementApp {
    public static void main(String[] args) {
        ProductRepository productRepository = new InMemoryProductRepository();
        ProductService productService = new ProductServiceImpl(productRepository);
        ProductManagement productManagement = new ProductManagementImpl(productService,new ShoppingCart(),new Scanner(System.in));
        ProductManagement.run();
    }
}
