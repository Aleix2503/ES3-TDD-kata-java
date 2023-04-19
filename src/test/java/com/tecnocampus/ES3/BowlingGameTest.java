package com.tecnocampus.ES3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {
    private Game g;
    @BeforeEach
    public void setUp() {
        g = new Game();
    }

    @Test
    public void create_game() {
        
    }

    @Test
    public void roll_a_ball() {
        var g = new Game();
        g.roll(0);
    }

}
