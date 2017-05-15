package kareta.lab6.machine.states;

import kareta.lab6.machine.SlotMachine;

/**
 * Created by vitya on 03.04.17.
 */
public interface State {
    void doAction(SlotMachine machine);
}
