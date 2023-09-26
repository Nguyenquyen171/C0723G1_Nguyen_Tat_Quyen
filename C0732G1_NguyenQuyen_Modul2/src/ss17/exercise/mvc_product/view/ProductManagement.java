package ss17.exercise.mvc_product.view;

import ss17.exercise.mvc_product.controller.ProductController;
import ss17.exercise.mvc_product.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    Scanner scanner = new Scanner(System.in);
    private final ProductController productController=new ProductController();


    public void showFan() {
        System.out.println("-----------Fan management program------------");
        System.out.println("1: Create new fan");
        System.out.println("2: Show Fan");
        System.out.println("3: Find name Fan");
        System.out.println("4: Exit");
    }

    public int choose() {
        int choiceOption = 0;
        this.showFan();
        do {
            try {
                System.out.println("Please choose the fan management program");
                choiceOption = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid option!!!");
            }
        } while (choiceOption < 1 || choiceOption > 4);
        if (choiceOption == 4) {
            System.exit(4);

        }
        return choiceOption;
    }
    public int inputID() {
        System.out.println("Please enter the ID Fan: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public Product inputNewInformation() {
        System.out.println("Enter new ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter new manufacturer Fan: ");
        String manufacturerFan = scanner.nextLine();
        System.out.println("Enter new describe: ");
        String describe = scanner.nextLine();

        return new Product(id, name, price, manufacturerFan, describe);

    }
    public void  managementProduct(){
        int choice= this.choose();
        this.showFan();
        do {
            switch (choice){
                case 1:
                    this.productController.addProduct(inputNewInformation());
                    break;
                case 2:
                    List<Product> superFans= this.productController.displayProduct();
                    for (Product superFan: superFans ){
                        System.out.println(superFan);
                    }
                    break;
                case 3:
                    List<Product> productsSearch = productController.searchProduct(inputNameProduct());
                    viewProduct(productsSearch);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while (choice!=4);
    }
    public void viewProduct(List<Product> products){
        for (Product product: products) {
            System.out.println(product);
        }
    }
    public String inputNameProduct(){
        System.out.println("Nhap ten san pham");
        String nameProduct = scanner.nextLine();
        return nameProduct;
    }

}
