package kareta.lab6.machine.proxy;

import kareta.lab6.machine.SlotMachine;

/**
 * Created by vitya on 04.04.17.
 */
public class MachineStatusProxy {
    private SlotMachine machine = new SlotMachine();

    public void printStatus() {
        machine.printStatus();
    }
}
