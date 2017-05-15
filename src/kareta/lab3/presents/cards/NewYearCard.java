package kareta.lab3.presents.cards;

/**
 * Created by vitya on 01.03.17.
 */
public class NewYearCard extends Card {

    Card card;

    public NewYearCard(Card card)
    {
        this.card = card;
        System.out.println("Making New year card");
    }

    public NewYearCard()
    {
        System.out.println("Making New year card");
    }
}
