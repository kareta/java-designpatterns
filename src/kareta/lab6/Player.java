package kareta.lab6;

import kareta.lab6.machine.SlotMachine;

/**
 * Created by vitya on 03.04.17.
 */
public class Player {
    public void pushStart(SlotMachine machine, int money) {
        machine.consumeMoney(money);
        machine.start();
    }
}
