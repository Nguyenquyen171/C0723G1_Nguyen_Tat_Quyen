package ssMVC.main;

import ssMVC.model.Cars;

public class MainController {

    public static void main(String[] args) {
        Main mainController = new Main();
        mainController.managementProgram();
        Cars cars= new Cars(12,"Mecedes",2000,"Quyen",20,"Sport");

    }
}
