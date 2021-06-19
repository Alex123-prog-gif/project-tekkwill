package service;

import entity.product.Product;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> productList = new ArrayList<>();

    public List<Product> getProductList(){return new ArrayList<>(productList);}

    public void addProduct(Product product) {this.productList.add(product);}

    public double getPrice(){
        double price = 0.0;
        for (Product product : productList){
            price += product.getPriceOnBill();
        }
        return price;
    }
    public double getSveMoney(){return getPrice() - getPriceWithoutDiscount();}

    private double getPriceWithoutDiscount() {
        double price =  0.0;
        for (Product product : productList){
            price += product.getPrice();
        }
        return price;
    }
}
