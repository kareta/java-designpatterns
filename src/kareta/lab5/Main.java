package kareta.lab5;


import kareta.lab5.builder.CarBuilder;
import kareta.lab5.builder.ChessBuilder;
import kareta.lab5.builder.PresentBuilder;
import kareta.lab5.presents.Present;
import kareta.lab5.template.CarFactory;
import kareta.lab5.template.ChessFactory;
import kareta.lab5.template.PresentFactory;

/**
 * Created by vitya on 28.03.17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Template");
        PresentFactory presentFactory = new CarFactory();
        Present present = presentFactory.create();
        System.out.println();

        System.out.println("Builder");
        PresentBuilder carBuilder = new CarBuilder();
        Present car = carBuilder.addPaper().addRose().build();
        System.out.println();

        System.out.println("Prototype");
        Present secondCar = car.clone();
        System.out.println();

        System.out.println("--------------------------------------------------------");

        System.out.println("Template");
        PresentFactory chessFactory = new ChessFactory();
        Present chess = chessFactory.create();
        System.out.println();

        System.out.println("Builder");
        PresentBuilder chessBuilder = new ChessBuilder();
        Present buildedChess = chessBuilder.addCard().addPaper().addRose().build();
        System.out.println();

        System.out.println("Prototype");
        Present secondChess = chess.clone();
        System.out.println();
    }
}
