package kareta.lab3.abstractfactory;

import kareta.lab3.presents.Car;
import kareta.lab3.presents.candies.Candies;
import kareta.lab3.presents.cards.Card;

/**
 * Created by vitya on 01.03.17.
 */
public interface AbstractPresentsFactory {
    Card makeCard();
    Candies makeCandies();

    Car makeCar();
}