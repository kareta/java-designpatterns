package kareta.lab6.machine.states;

import kareta.lab6.machine.SlotMachine;

/**
 * Created by vitya on 04.04.17.
 */
public class ReadyState implements State {
    @Override
    public void doAction(SlotMachine machine) {
        System.out.println("Ready to play");
    }
}
