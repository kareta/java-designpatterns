package kareta.lab3.factorymethod;

import kareta.lab3.presents.Chess;
import kareta.lab3.presents.Present;

/**
 * Created by vitya on 01.03.17.
 */
public class ChessFactory implements PresentFactory {
    @Override
    public Present makePresent() {

        System.out.println("I am chess factory");

        return new Chess();
    }
}
