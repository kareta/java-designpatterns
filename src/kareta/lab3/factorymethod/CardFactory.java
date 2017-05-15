package kareta.lab3.factorymethod;

import kareta.lab3.presents.cards.Card;
import kareta.lab3.presents.Present;

/**
 * Created by vitya on 01.03.17.
 */
public class CardFactory implements PresentFactory {
    @Override
    public Present makePresent() {

        System.out.println("I am CardFactory");

        return new Card();
    }
}
