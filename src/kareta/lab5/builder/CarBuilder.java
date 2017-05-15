package kareta.lab5.builder;


import kareta.lab5.presents.Car;
import kareta.lab5.presents.Present;
import kareta.lab5.presents.PresentWithCard;
import kareta.lab5.presents.PresentWithPaper;
import kareta.lab5.presents.PresentWithRoses;

/**
 * Created by vitya on 01.04.17.
 */
public class CarBuilder implements PresentBuilder {

    private Present car = new Car();

    @Override
    public PresentBuilder addCard() {
        car = new PresentWithCard(car);

        return this;
    }

    @Override
    public PresentBuilder addPaper() {
        car = new PresentWithPaper(car);

        return this;
    }

    @Override
    public PresentBuilder addRose() {
        car = new PresentWithRoses(car);

        return this;
    }

    @Override
    public Present build() {
        return car;
    }
}
