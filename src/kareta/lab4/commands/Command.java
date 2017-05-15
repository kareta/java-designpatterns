package kareta.lab4.commands;

import kareta.lab4.ControlCenter;

/**
 * Created by vitya on 11.03.17.
 */
public abstract class Command {

    protected ControlCenter controlCenter;

    protected Command(ControlCenter controlCenter) {
        this.controlCenter = controlCenter;
    }

    public abstract void execute();
}
