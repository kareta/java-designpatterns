package kareta.lab3;

import kareta.lab3.abstractfactory.AbstractPresentsFactory;
import kareta.lab3.abstractfactory.BirthdayFactory;
import kareta.lab3.abstractfactory.NewYearFactory;
import kareta.lab3.factorymethod.CarFactory;
import kareta.lab3.factorymethod.ChessFactory;
import kareta.lab3.factorymethod.PresentFactory;
import kareta.lab3.presents.Chess;
import kareta.lab3.presents.PresentWithCard;
import kareta.lab3.presents.PresentWithPaper;
import kareta.lab3.presents.PresentWithRoses;


/**
 * Created by vitya on 09.03.17.
 */
public class Main {
    public static void main(String[] args) {
        AbstractPresentsFactory factory = new BirthdayFactory();
        factory.makeCandies();
        factory.makeCard();
        factory.makeCar();

        System.out.println();

        factory = new NewYearFactory();
        factory.makeCandies();
        factory.makeCard();
        factory.makeCar();

        System.out.println();

        PresentFactory presentFactory = new ChessFactory();
        presentFactory.makePresent();

        System.out.println();

        presentFactory = new CarFactory();
        presentFactory.makePresent();

        System.out.println();

        Chess chess = new Chess();
        PresentWithCard chessWithCard = new PresentWithCard(chess);
        PresentWithRoses chessRoses = new PresentWithRoses(chess);
        PresentWithPaper chessPaper = new PresentWithPaper(chess);
    }
}
