package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class HandDisplayTest {

    @Test
    public void displayFirstCard() throws Exception {
        Hand hand = new Hand(List.of(new Card(Suit.HEARTS, Rank.ACE)));

        assertThat(hand.displayFirstCard())
                .isEqualTo("[31m┌─────────┐[1B[11D│A        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        A│[1B[11D└─────────┘");
    }
}