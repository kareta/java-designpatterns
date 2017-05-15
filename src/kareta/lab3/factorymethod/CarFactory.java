package kareta.lab3.factorymethod;

import kareta.lab3.presents.Car;
import kareta.lab3.presents.Present;

/**
 * Created by vitya on 01.03.17.
 */
public class CarFactory implements PresentFactory {
    @Override
    public Present makePresent() {

        System.out.println("I am CarFactory");

        return new Car();
    }
}
