package test.com.jc.beginner.basics.conditional_and_loops;

import main.com.jc.beginner.basics.conditionals_and_loops.GuessTheOutput;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class GuessTheOutputTest {
    @Test
    public void simpleIfOneTest() {

        GuessTheOutput gto = new GuessTheOutput();
        int answer = gto.simpleIf_gto_one(10);

        assertNotSame(12, answer);
        assertEquals( 11 , answer);
    }

    @Test
    public void simpleIfTwoTest() {

        GuessTheOutput gto = new GuessTheOutput();
        String answer = gto.simpleIf_gto_two(10);

        assertEquals("hmm, didn't evaluate any if's", answer);
    }

    @Test
    public void simpleIfThreeTest() {

        GuessTheOutput gto = new GuessTheOutput();
        gto.simpleIf_gto_three();
    }



}
