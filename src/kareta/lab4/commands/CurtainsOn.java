package kareta.lab4.commands;

import kareta.lab4.ControlCenter;

/**
 * Created by vitya on 11.03.17.
 */
public class CurtainsOn extends Command {

    public CurtainsOn(ControlCenter controlCenter) {
        super(controlCenter);
    }

    @Override
    public void execute() {
        controlCenter.curtainsOn();
    }
}
