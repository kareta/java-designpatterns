package kareta.lab5.builder;

import kareta.lab5.presents.*;

/**
 * Created by vitya on 01.04.17.
 */
public class ChessBuilder implements PresentBuilder {

    private Present chess = new Chess();

    @Override
    public PresentBuilder addCard() {
        chess = new PresentWithCard(chess);

        return this;
    }

    @Override
    public PresentBuilder addPaper() {
        chess = new PresentWithPaper(chess);

        return this;
    }

    @Override
    public PresentBuilder addRose() {
        chess = new PresentWithRoses(chess);

        return this;
    }

    @Override
    public Present build() {
        return chess;
    }
}
