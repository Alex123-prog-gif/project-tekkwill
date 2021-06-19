package servicepack;

import dao.ProductRepository;
import entity.product.FoodCategory;
import entity.product.Product;
import exceptions.ProductUpdateUnknownPropertyException;

import java.time.LocalDate;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
    }


    public void ProductRepositoryImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }





     public void create(String name, double price, LocalDate bestBefore, double volume){
           create(name, price, bestBefore, volume);
    }
    public void create(String name, double price, LocalDate bestBefore, FoodCategory category){
 create(name, price, bestBefore, category);
    }
    public List<Product> getAll(){
        return getAll();
    }
    public List<Product> getAllNonExpired(){
        return getAllNonExpired();
    }
     public Product getById(int id){
        return getById(id);
     }
    public void update(int id, double volume) throws ProductUpdateUnknownPropertyException{

    }
    public void update(int id, FoodCategory category) throws ProductUpdateUnknownPropertyException{

    }
    public void delete(int id){

    }
}
