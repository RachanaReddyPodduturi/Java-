package test.com.jc.beginner.simple_interview_programs;

import main.com.jc.beginner.simple_interview_programs.GetEvenOrOddNumbers;
import org.junit.Assert;
import org.junit.Test;

public class GetEvenOrOddNumbersTest {

@Test
 public void getEvenNumbersTest() {
     GetEvenOrOddNumbers ge = new GetEvenOrOddNumbers();
    Assert.assertNotNull(ge.getEvenNumbers());
 }
}
