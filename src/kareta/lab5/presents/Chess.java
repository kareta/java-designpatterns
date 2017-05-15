package kareta.lab5.presents;

/**
 * Created by vitya on 01.03.17.
 */
public class Chess implements Present {
    public Chess() {
        System.out.println("Making new Chess");
    }

    @Override
    public Present clone() {
        return new Chess();
    }
}
