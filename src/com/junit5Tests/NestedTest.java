package com.junit5Tests;

import com.junit5Classes.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTest {

    Calculator calculator;

    @BeforeEach
    public void init(){
        calculator = new Calculator();
    }

    @Nested
    class addPositiveNumbers{
        @Test
        public void addSmallPositiveNumbers(){
            int sum = calculator.add(2, 3);
            System.out.println(sum);
        }


        @Test
        public void addBigPositiveNumbers(){
            int sum = calculator.add(1000, 500);
            System.out.println(sum);
        }
    }


    @Nested
    class addNegativeNumbers{
        @Test
        public void addSmallNegativeNumbers(){
            int sum = calculator.add(-20, -3);
            System.out.println(sum);
        }


        @Test
        public void addBigNegativeNumbers(){
            int sum = calculator.add(-1, -2);
            System.out.println(sum);
        }
    }

    @Nested
    class addZeroNumbers{
        @Test
        public void addPositiveZeroNumbers(){
            int sum = calculator.add(0, 0);
            System.out.println(sum);
        }


        @Test
        public void addNegativeZeroNumbers(){
            int sum = calculator.add(-0, -0);
            System.out.println(sum);
        }
    }
}
