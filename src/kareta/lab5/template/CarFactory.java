package kareta.lab5.template;

import kareta.lab5.presents.*;

/**
 * Created by vitya on 28.03.17.
 */
public class CarFactory extends PresentFactory {
    @Override
    public Present addCard(Present present) {
        return new PresentWithCard(present);
    }

    @Override
    public Present addPaper(Present present) {
        return new PresentWithPaper(present);
    }

    @Override
    public Present addRose(Present present) {
        return new PresentWithRoses(present);
    }

    @Override
    protected Present produce() {
        return new Car();
    }
}
