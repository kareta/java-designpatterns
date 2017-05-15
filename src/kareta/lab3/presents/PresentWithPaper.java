package kareta.lab3.presents;

/**
 * Created by vitya on 11.03.17.
 */
public class PresentWithPaper implements Present {
    Present present;

    public PresentWithPaper(Present present) {
        System.out.println("Decorated with paper");
        this.present = present;
    }
}
