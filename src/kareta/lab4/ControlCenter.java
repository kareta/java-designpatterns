package kareta.lab4;

import kareta.lab4.commands.*;
import kareta.lab4.control.*;

/**
 * Created by vitya on 11.03.17.
 */
public class ControlCenter {
    private static ControlCenter controlCenter;
    private ConditionerControl conditionerControl = new ConditionerControl("Conditioner control");
    private CurtainsControl curtainsControl = new CurtainsControl("Curtains control");
    private DoorControl doorControl = new DoorControl("Door control");
    private HeatControl heatControl = new HeatControl("Heat control");
    private LightControl lightControl = new LightControl("Light control");

    private ControlCenter() {}
    
    public static ControlCenter getControlCenter ()
    {
        if (controlCenter == null) {
            controlCenter = new ControlCenter();
        }

        return controlCenter;
    }

    public void execute(Command command) {
        command.execute();
    }

    public void conditionerOn() {
        conditionerControl.switchOn();
    }

    public void conditionerOff() {
        conditionerControl.switchOff();
    }

    public void curtainsOn() {
        curtainsControl.switchOn();
    }

    public void curtainsOff() {
        curtainsControl.switchOff();
    }

    public void doorOn() {
        doorControl.switchOn();
    }

    public void doorOff() {
        doorControl.switchOff();
    }

    public void heatOn() {
        heatControl.switchOn();
    }

    public void heatOff() {
        heatControl.switchOff();
    }

    public void lightOn() {
        lightControl.switchOn();
    }

    public void lightOff() {
        lightControl.switchOff();
    }

    public void setConditionerControl(ConditionerControl conditionerControl) {
        this.conditionerControl = conditionerControl;
    }

    public void setCurtainsControl(CurtainsControl curtainsControl) {
        this.curtainsControl = curtainsControl;
    }

    public void setDoorControl(DoorControl doorControl) {
        this.doorControl = doorControl;
    }

    public void setHeatControl(HeatControl heatControl) {
        this.heatControl = heatControl;
    }

    public void setLightControl(LightControl lightControl) {
        this.lightControl = lightControl;
    }
}
