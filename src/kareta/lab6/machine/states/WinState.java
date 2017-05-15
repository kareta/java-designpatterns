package kareta.lab6.machine.states;

import kareta.lab6.machine.SlotMachine;

/**
 * Created by vitya on 04.04.17.
 */
public class WinState implements State {
    @Override
    public void doAction(SlotMachine machine) {
        System.out.println("You are winner.");
    }
}
