package ss7.thuchanh.animal_interface_edible;

import ss7.thuchanh.interface_comparable.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}