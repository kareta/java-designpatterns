package kareta.lab5.builder;

import kareta.lab5.presents.Present;

/**
 * Created by vitya on 01.04.17.
 */
public interface PresentBuilder {

    PresentBuilder addCard();

    PresentBuilder addPaper();

    PresentBuilder addRose();

    Present build();
}
