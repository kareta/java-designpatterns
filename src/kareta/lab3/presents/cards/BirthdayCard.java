package kareta.lab3.presents.cards;

/**
 * Created by vitya on 01.03.17.
 */
public class BirthdayCard extends Card {

    Card card;

    public BirthdayCard(Card card) {
        this.card = card;
        System.out.println("Making birthday card");
    }

    public BirthdayCard() {
        System.out.println("Making birthday card");
    }
}
