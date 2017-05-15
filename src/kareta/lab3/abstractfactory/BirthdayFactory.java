package kareta.lab3.abstractfactory;

import kareta.lab3.presents.Car;
import kareta.lab3.presents.candies.BirthdayCandies;
import kareta.lab3.presents.candies.Candies;
import kareta.lab3.presents.cards.BirthdayCard;
import kareta.lab3.presents.cards.Card;

/**
 * Created by vitya on 01.03.17.
 */
public class BirthdayFactory implements AbstractPresentsFactory {
    @Override
    public Card makeCard() {
        return new BirthdayCard();
    }

    @Override
    public Candies makeCandies() {
        return new BirthdayCandies();
    }

    @Override
    public Car makeCar() {
        return new Car();
    }
}
