package com.junit5Tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    public void assumeTrueTest(){
        Assumptions.assumeTrue(true);
        System.out.println("Executing as Assumption is true!");
    }

    @Test
    public void assumeFalseTest(){
        Assumptions.assumeFalse(false);
        System.out.println("Executing as Assumption is false!");
    }
}
