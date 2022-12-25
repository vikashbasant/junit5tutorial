package com.junit5Tests;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Multiple order we want to execute the Test Execution Order of @Test Methods:
 * By Default it is alphanumeric @Test Method is executed:
 */
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(value = MethodOrderer.Alphanumeric.class)
//@TestMethodOrder(value = MethodOrderer.Random.class)
//@TestMethodOrder(value = MethodOrderer.MethodName.class)
//@TestMethodOrder(value = MethodOrderer.DisplayName.class)
public class TestExecutionOrderTest {

    @Test
    @Order(4)
    public void test1(){
        System.out.println("This is Test 1.");
    }

    @Test
    @Order(3)
    public void test2(){
        System.out.println("This is Test 2.");
    }

    @Test
    @Order(2)
    public void test3(){
        System.out.println("This is Test 3.");
    }

    @Test
    @Order(1)
    public void test4(){
        System.out.println("This is Test 4.");
    }





}
