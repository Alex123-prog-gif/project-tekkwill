package app;

import servicepack.ProductService;

import java.util.Scanner;

public class ProductManagementAdminMenu {

    private final Scanner scanner;
    private final ProductService productService;

    ProductManagementAdminMenu(Scanner scanner, ProductService productService){
        this.scanner = scanner;
        this.productService = productService;
    }
    public  void showMenu() {
        boolean exitOptionNotSelected;
        do {
            System.out.println("Available options:");
            System.out.println("==============Admin Options=============="+
                    "[1] View all products" +
                    "[2] View all expired products" +
                    "[3] Add new product" +
                    "[4] Update food product" +
                    "[5] Update drink product" +
                    "[6] Remove product");
            System.out.println("=============================");
            System.out.println("[0] Exit");
            System.out.println("=============================");
            System.out.println(">>");
            exitOptionNotSelected = handleAdminChoice(scanner.nextInt());
        }while (exitOptionNotSelected);
    }




    private boolean handleAdminChoice(int i){
        scanner.nextLine();
        switch (handleAdminChoice()){
            case 1:
                viewAllProducts();
                return true;
            case 2:
                viewAllExpiredProducts();
                return true;
            case 3:
                addNewProduct();
                return true;
            case 4:
                updateFood();
                return true;
            case 5:
                updateDrink();
                return true;
            case 6:
                removeProduct();
                return true;
        }
            return handleAdminChoice(scanner.nextInt());
    }

    private boolean handleAdminChoice() {
        return handleAdminChoice();
    }

    private void removeProduct() {
        return;
    }

    private void updateDrink() {
        return;
    }

    private void updateFood() {
        return;
    }

    private void addNewProduct() {
        return;
    }

    private void viewAllExpiredProducts() {
        return;
    }

    private void viewAllProducts() {
        return;
    }


}
