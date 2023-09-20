package ssMVC.view;

import ssMVC.model.Cars;

public class Main {

    public static void main(String[] args) {
        ProductManagement mainController = new ProductManagement();
        mainController.managementProgram();
        Cars cars= new Cars(12,"Mecedes",2000,"Quyen",20,"Sport");

    }
}
