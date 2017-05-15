package kareta.lab3.presents;

/**
 * Created by vitya on 11.03.17.
 */
public class PresentWithCard implements Present {
    Present present;

    public PresentWithCard(Present present) {
        System.out.println("This is present with card");
        this.present = present;
    }
}
