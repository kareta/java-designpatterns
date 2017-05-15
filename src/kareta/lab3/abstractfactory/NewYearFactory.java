package kareta.lab3.abstractfactory;

import kareta.lab3.presents.Car;
import kareta.lab3.presents.candies.Candies;
import kareta.lab3.presents.candies.NewYearCandies;
import kareta.lab3.presents.cards.Card;
import kareta.lab3.presents.cards.NewYearCard;

/**
 * Created by vitya on 01.03.17.
 */
public class NewYearFactory implements AbstractPresentsFactory {

    @Override
    public Card makeCard() {
        return new NewYearCard();
    }

    @Override
    public Candies makeCandies() {
        return new NewYearCandies();
    }

    @Override
    public Car makeCar() {
        return new Car();
    }
}
