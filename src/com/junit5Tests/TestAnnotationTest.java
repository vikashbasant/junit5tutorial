package com.junit5Tests;

import com.junit5Classes.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

//@Disabled("Not working!")
public class TestAnnotationTest {

    @Test
    @DisplayName("Adding 2 Positive Numbers")
    public void testMethod1(){
        Calculator calculator = new Calculator();
        int sum = calculator.add(10,20);
        System.out.println("The total is : " + sum);
    }

    @DisplayName("Adding 2 Negative Numbers")
    @Test
    @Disabled("Not executing as the functionality is not working! something like that.")
    public void testMethod2(){
        Calculator calculator = new Calculator();
        int sum = calculator.add(-20, -30);
        System.out.println("The total is : "+ sum);
    }

    // private method is not test by junit5:
    private void testMethod3(){
        Calculator calculator = new Calculator();
        int sum = calculator.add(-20, 30);
        System.out.println("The total is : "+ sum);
    }

}
