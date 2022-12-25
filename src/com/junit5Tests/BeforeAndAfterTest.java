package com.junit5Tests;

import com.junit5Classes.Calculator;
import org.junit.jupiter.api.*;

// One thing very clear in mind @BeforeAll, @AfterAll is static method:
public class BeforeAndAfterTest {

    Calculator calculator;

    @BeforeAll
    public static void beforeAllMethod(){
        System.out.println("It execute only one time per class before executing other test method!");
        System.out.println("Establishing connection to the database!");
    }

    @AfterAll
    public static void afterAllMethod(){
        System.out.println("It execute only one time per class after executing other test method!");
        System.out.println("Closing connection to the database!");
    }

    @BeforeEach
    // Before each @Test method this @BeforeEach is executing (i.e here @BeforeEach execute twice):
    public void init(){
        calculator = new Calculator();
        System.out.println("Initializing the calculator instance.");
    }

    @Test
    @DisplayName("Adding 2 Positive Numbers")
    public void testMethod1(){
        int sum = calculator.add(10,20);
        System.out.println("The total is : " + sum);
    }

    @Test
    @DisplayName("Adding 2 Negative Numbers")
    public void testMethod2(){
        int sum = calculator.add(-20, -30);
        System.out.println("The total is : "+ sum);
    }

    @AfterEach
    // After each @Test method this @AfterEach is executing (i.e here @AfterEach execute twice):
    public void teatDown(){
        System.out.println("The test method executed successfully.");
    }

}
