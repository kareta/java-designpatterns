package kareta.lab4;

import kareta.lab4.commands.Command;

/**
 * Created by vitya on 11.03.17.
 */
public class SmartHouse {
    ControlCenter controlCenter;

    public SmartHouse(ControlCenter controlCenter) {
        this.controlCenter = controlCenter;
    }

    public void execute(Command command) {
        controlCenter.execute(command);
    }
}
