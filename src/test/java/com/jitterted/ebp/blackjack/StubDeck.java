package com.jitterted.ebp.blackjack;

import com.jitterted.ebp.blackjack.domain.Card;
import com.jitterted.ebp.blackjack.domain.Deck;
import com.jitterted.ebp.blackjack.domain.Rank;
import com.jitterted.ebp.blackjack.domain.Suit;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StubDeck extends Deck {
    private static final Suit DUMMY_SUIT = Suit.HEARTS;
    private final ListIterator<Card> iterator;

    public StubDeck(Rank... ranks) {
        List<Card> cards = new ArrayList<>();
        for (Rank rank : ranks) {
            cards.add(new Card(DUMMY_SUIT, rank));
        }
        this.iterator = cards.listIterator();
    }

    public StubDeck(List<Card> cards) {
        this.iterator = cards.listIterator();
    }

    public static StubDeck playerHitsAndGoesBust() {
        return new StubDeck(Rank.TEN, Rank.EIGHT,
                            Rank.QUEEN, Rank.JACK,
                            Rank.THREE);
    }

    public static StubDeck playerBeatsDealerUponInitialDeal() {
        return new StubDeck(Rank.TEN, Rank.EIGHT,
                            Rank.QUEEN, Rank.JACK);
    }

    @Override
    public Card draw() {
        return iterator.next();
    }
}
