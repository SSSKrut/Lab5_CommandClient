package server.conveyor.cards;

public class Card {
    private CardSuit cardSuit;
    private CardNum cardNum;

    public Card(CardNum num, CardSuit suit) {
        this.cardNum = num;
        this.cardSuit = suit;
    }

    public Card(Card card) {
        this.cardNum = CardNum.fromId(card.cardNum.id);
        this.cardSuit = CardSuit.fromId(card.cardSuit.id);
    }

    public Card() {

    }

    @Override
    public String toString() {
        return cardNum.name() + " " + cardSuit.name();
    }

    public CardNum getNum() {
        return cardNum;
    }

    public CardSuit getSuit() {
        return cardSuit;
    }
}
