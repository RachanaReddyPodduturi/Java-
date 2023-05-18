package test.com.jc.beginner.basics;

import main.com.jc.beginner.basics.fundamentals.MyFirstClass;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstClassTest {

    @Test // anotation
    public void testAdd() {
        MyFirstClass myFirstClass = new MyFirstClass(3,2);
        MyFirstClass m1 = new MyFirstClass(100,200);
        assertEquals(5, myFirstClass.sum());
        assertEquals(300, m1.sum());
    }

    @Test
    public void testDifference() {
        MyFirstClass myFirstClass = new MyFirstClass(10, 20); //10-20 = -10
        assertEquals(-10, myFirstClass.difference());
    }

    @Test
    public void testMultiplication() {
        MyFirstClass myFirstClass = new MyFirstClass(50, 12);
        assertEquals(600, myFirstClass.multiplication());
    }
}
