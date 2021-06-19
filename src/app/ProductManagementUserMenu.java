package app;

import service.ShoppingCart;
import servicepack.ProductService;

import java.util.Scanner;

public class ProductManagementUserMenu {
    private Scanner scanner;
    private final ProductService productService;
    private final ShoppingCart cart;

    public ProductManagementUserMenu(ProductService productService,ShoppingCart cart,Scanner scanner){
        this.scanner = scanner;
        this.productService = productService;
        this.cart = cart;
    }



    public void showMenu(){
      boolean exitOptionNotSelected;
      do {
          System.out.println("=======User Option=========");
          System.out.println("[1] View all products" +
                  "[2] View shopping cart" +
                  "[3] Add product to shopping cart" +
                  "[4] Print bill" +
                  "==========================" +
                  "[0] Exit" +
                  "==========================");
          System.out.println(">>");
          exitOptionNotSelected = handleUserChoice(scanner.nextLine());
      }while (exitOptionNotSelected);
    }



    private  handleUserChoice(String s) {
        scanner.nextLine();
        switch (handleUserChoice()) {
            case 1:
                showMenu();
                break;
            case 2:
                addProductToShoopingCart();
                break;
            case 3:
                printBill();
                break;
            case 4:
                viewAllNonExpiredProduct();
                break;
        }
    }

    private void viewAllNonExpiredProduct() {
        return;
    }

    private void printBill() {
        return;
    }

    private void addProductToShoopingCart() {
        return;
    }

    private boolean handleUserChoice(int i) {
        return handleUserChoice(scanner);
    }




}
