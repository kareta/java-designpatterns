package kareta.lab5.template;

import kareta.lab5.presents.Present;

/**
 * Created by vitya on 28.03.17.
 */
public abstract class PresentFactory {

    public abstract Present addCard(Present present);

    public abstract Present addPaper(Present present);

    public abstract Present addRose(Present present);

    protected abstract Present produce();

    public Present create() {
        Present present = produce();
        present = addPaper(present);
        present = addRose(present);
        return addCard(present);
    }
}
