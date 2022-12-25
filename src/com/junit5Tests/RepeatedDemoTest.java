package com.junit5Tests;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedDemoTest {

//    @Test // No need to write @Test because @RepeatedTest(3) also @Test
    @org.junit.jupiter.api.RepeatedTest(3)
    public void repeatedTestMethod(){
        System.out.println("I am executing this test multiple times.");
    }

    @org.junit.jupiter.api.RepeatedTest(value = 2)
    public void repeatedTestMethod1(){
        System.out.println("Here We are executing this test exactly 2 times.");
    }


    // Here we want to execute this exactly 4 time with displayName:
    @org.junit.jupiter.api.RepeatedTest(value = 4, name = "{displayName} - repetition - {currentRepetition}/{totalRepetitions}")
    public void repeatedTestMethod2(){
        System.out.println("Here We are executing this test exactly 4 times.");
    }



    // Here we want to execute this exactly 1 time with displayName:
    @org.junit.jupiter.api.RepeatedTest(value = 1, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void repeatedTestMethod3(){
        System.out.println("Here We are executing this test exactly 4 times.");
    }


    // Here we want to execute this exactly 1 time with displayName:
    @RepeatedTest(value = 1, name = RepeatedTest.SHORT_DISPLAY_NAME)
    public void repeatedTestMethod4(){
        System.out.println("Here We are executing this test exactly 4 times.");
    }


    // Here we want to execute this exactly 1 time with displayName:
    @RepeatedTest(3)
    public void repeatedTestMethod5(RepetitionInfo repetitionInfo){
        System.out.println(repetitionInfo.getCurrentRepetition());
        System.out.println(repetitionInfo.getTotalRepetitions());
    }


}
