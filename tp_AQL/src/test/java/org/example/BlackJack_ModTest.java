package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackJack_ModTest {

    @Test
    public void leftPlayerWins() {
        int rslt = new BlackJack_Mod().play(10, 9);
        Assertions.assertEquals(10, rslt);
    }

}
