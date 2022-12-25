package com.junit5Tests;

import com.junit5Classes.Calculator;
import org.junit.jupiter.api.*;

public class AssertionsTest {
    Calculator calculator;

    @BeforeEach
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void assertEqualsTest(){
        int sum = calculator.add(2,2);
        Assertions.assertEquals(4, sum, "Test Failed as expected value is not equal to actual value!");
    }

    @Test
    public void assertNotEqualsTest(){
        int sum = calculator.add(2,2);
        Assertions.assertNotEquals(3, sum, "Test Failed as expected value and actual value are same!");
    }


    @Test
    public void assertArrayEqualsTest(){
        int sum = calculator.add(2,2);
//        Assertions.assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3}, "Test Failed as expected array value and actual array value are not same!");
//        Assertions.assertArrayEquals(new int[]{1,2,3}, new int[]{1,3,2}, "Test Failed as expected array value and actual array value are not same!");
        Assertions.assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3,4}, "Test Failed as expected array value and actual array value are not same!");
    }


    @Test
    public void assertNullTest(){
        String nullString = null;
        String notNullString = "Vikash";
        Assertions.assertNull(nullString);
    }


    @Test
    public void assertNotNullTest(){
        String nullString = null;
        String notNullString = "Vikash";
        Assertions.assertNotNull(notNullString);
    }

    @Test
    public void assertTrueTest(){
        boolean tFlag = true;
        boolean fFlag = false;
        Assertions.assertTrue(tFlag);
    }


    @Test
    public void assertFalseTest(){
        boolean tFlag = true;
        boolean fFlag = false;
        Assertions.assertFalse(fFlag, "Test failed as test expecting false but found ture.");
    }

}
