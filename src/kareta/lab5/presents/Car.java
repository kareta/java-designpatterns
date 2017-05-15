package kareta.lab5.presents;

/**
 * Created by vitya on 01.03.17.
 */
public class Car implements Present {

    public Car() {
        System.out.println("Making new Car");
    }

    @Override
    public Present clone() {
        return new Car();
    }
}
