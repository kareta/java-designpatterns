package kareta.lab6;

import kareta.lab6.machine.Image;
import kareta.lab6.machine.SlotMachine;
import kareta.lab6.machine.proxy.MachineStatusProxy;

/**
 * Created by vitya on 01.04.17.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        SlotMachine machine = new SlotMachine();
        machine.setBetImage(Image.BANANA);

        player.pushStart(machine, 5);
        System.out.println(machine.toString());
        machine.printStatus();

        player.pushStart(machine, 1);
        System.out.println(machine.toString());
        machine.printStatus();

        player.pushStart(machine, 1);
        System.out.println(machine.toString());
        machine.printStatus();

        player.pushStart(machine, 5);
        System.out.println(machine.toString());
        machine.printStatus();

        machine.printMoney();

        System.out.println();
        System.out.println("Proxy");

        MachineStatusProxy proxy = new MachineStatusProxy();
        proxy.printStatus();
    }
}
