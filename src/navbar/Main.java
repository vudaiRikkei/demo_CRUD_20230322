package navbar;

import config.Config;
import model.Product;
import service.Service;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Product> productList = new ArrayList<>();
    public static void main(String[] args) {

        productList.add(new Product(10, "name1", 12, 100, "blue", "asdas"));
        productList.add(new Product(9, "name1", 15, 100, "blue", "asdas"));
        productList.add(new Product(20, "name1", 22, 100, "blue", "asdas"));
        productList.add(new Product(30, "name1", 2, 100, "blue", "asdas"));
        int choice;
        do {
            System.out.println("1. show all product list");
            System.out.println("2. add product");
            System.out.println("3. edit product");
            System.out.println("4. delete product");
            System.out.println("0. end");
            choice = Config.getScanner().nextInt();
            switch (choice){
                case 1:
                    System.out.println(productList);
                    break;
                case 2:
                    Service.addProduct();
                    break;
                case 3: Service.editProduct();
                    break;
                case 4: Service.deleteById();
                    break;
            }
        }while (choice != 0);
    }
}
