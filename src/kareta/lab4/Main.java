package kareta.lab4;

import kareta.lab4.apple.AppleConditionerControl;
import kareta.lab4.commands.ConditionerOff;
import kareta.lab4.commands.CurtainsOn;
import kareta.lab4.samsung.SamsungCurtainsControl;

/**
 * Created by vitya on 11.03.17.
 */
public class Main {
    public static void main(String[] args) {
        ControlCenter controlCenter = ControlCenter.getControlCenter();

        controlCenter.setConditionerControl(new AppleConditionerControl());
        controlCenter.setCurtainsControl(new SamsungCurtainsControl());

        SmartHouse smartHouse = new SmartHouse(controlCenter);
        smartHouse.execute(new ConditionerOff(controlCenter));
        smartHouse.execute(new CurtainsOn(controlCenter));
    }
}
