package kareta.lab3.presents;

/**
 * Created by vitya on 11.03.17.
 */
public class PresentWithRoses implements Present {
    Present present;

    public PresentWithRoses(Present present) {
        System.out.println("This is present with roses");
        this.present = present;
    }
}
