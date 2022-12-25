package com.junit5Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ConditionalTest {
    /**
     * 1. Condition on operating System.
     * 2. Condition on particular JRE.
     * 3. Condition on JRE range.
     * 4. Condition on System Properties.
     */

    @Test
    @EnabledOnOs(OS.LINUX)
    public void conditionOnOs(){
        System.out.println("Execute this test only in Ubuntu Machine!");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void conditionONJRE(){
        System.out.println("Execute this test for java 8!");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8 , max = JRE.JAVA_11)
    public void conditionOnJreRange(){
        System.out.println("Execute this test only for range 8-11");
    }

    @Test
    @EnabledIfSystemProperty(named = "user.dir", matches = "/home/decimal/IdeaProjects/junit5tutorial")
    public void  conditionOnSystemProperty(){
        System.out.println(System.getProperty("user.dir"));
    }

}
