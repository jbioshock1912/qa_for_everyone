package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CorrectTest {

    @Test
    public void correct() {
        assertEquals("J. D. SALINGER - THE CATCHER IN THE RYE", Correct.correct(Correct.correct("J. D. 5AL1NGER - THE CATCHER 1N THE RYE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE PHILOSOPHER'S STONE", Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE PH1L050PHER'5 5T0NE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE CHAMBER OF SECRETS", Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE CHAMBER 0F 5ECRET5")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE PRISONER OF Azkaban", Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE PR150NER 0F Azkaban")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE GOBLET OF FIRE", Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE G0BLET 0F F1RE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE ORDER OF PHOENIX", Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE 0RDER 0F PH0EN1X")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE HALF-BLOOD PRINCE", Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE HALF-BL00D PR1NCE")));
        assertEquals("J. K. ROWLING - HARRY POTTER AND THE DEATHLY HALLOWS", Correct.correct(Correct.correct("J. K. R0WL1NG - HARRY P0TTER AND THE DEATHLY HALL0W5")));
        assertEquals("URSULA K. LE GUIN - A WIZARD OF EARTHSEA", Correct.correct(Correct.correct("UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA")));
        assertEquals("URSULA K. LE GUIN - THE TOMBS OF ATUAN", Correct.correct(Correct.correct("UR5ULA K. LE GU1N - THE T0MB5 0F ATUAN")));
        assertEquals("URSULA K. LE GUIN - THE FARTHEST SHORE", Correct.correct(Correct.correct("UR5ULA K. LE GU1N - THE FARTHE5T 5H0RE")));
        assertEquals("URSULA K. LE GUIN - TALES FROM EARTHSEA", Correct.correct(Correct.correct("UR5ULA K. LE GU1N - TALE5 FR0M EARTH5EA")));
    }
}