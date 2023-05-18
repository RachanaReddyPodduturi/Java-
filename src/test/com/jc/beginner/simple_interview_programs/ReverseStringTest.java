package test.com.jc.beginner.simple_interview_programs;

import main.com.jc.beginner.simple_interview_programs.ReverseString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void reverseStringTest() {
        ReverseString rs = new ReverseString();
        assertEquals("avaJ", rs.reverseString("Java"));
    }
}
