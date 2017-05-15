package kareta.lab4.control;

import kareta.lab4.WifiConnector;

import java.util.Random;

/**
 * Created by vitya on 11.03.17.
 */
public abstract class ControlElement {

    private int id;
    private WifiConnector wifiConnector;

    private final String name;
    private boolean switched;
    private int level;

    public ControlElement(String name) {
        id = new Random().nextInt();
        this.name = name;
    }

    public void switchOn() {
        switched = true;
        System.out.println(getState());
    }

    public void switchOff() {
        switched = false;
        System.out.println(getState());
    }

    public void setLevel(int level) {
        this.level = level;
        System.out.println(getState());
    }

    public int getLevel() {
        return level;
    }

    public int getId() {
        return id;
    }

    public WifiConnector getWifiConnector() {
        return wifiConnector;
    }

    public String getState() {
        return "Name is " + name + "; Switched: " + switched;
    }
}
