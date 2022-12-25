package com.junit5Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class ParameterizationTest {

    /**
     * 1. @ValueSource
     * 2. @EnumSource
     * 3. @MethodSource
     * 4. @CsvSource
     * 5. @CsvFileSource
     * 6. @ArgumentsSource
     */

    //---------------@ValueSource----------------------------------------
    @ParameterizedTest(name = "{index} - Run test with args = {0}")
    @ValueSource(ints = {1,2,5,6,7,3})
    public void valueSourceTest(int args){
        System.out.println(args);
    }

    @ParameterizedTest(name = "{index} - Run test with args = {0}")
    @ValueSource(strings = {"apple", "banana", "orange", "papaya"})
    public void valueSourceTest2(String fruit){
        System.out.println(fruit);
    }


    //---------------@EnumSource----------------------------------------
    enum Fruits{
        apple, banana, orange, papaya;
    }

    @ParameterizedTest(name = "{index} - Run test with args = {0}")
    @EnumSource(Fruits.class)
    // Here If we want entire enum then we used EnumName.class
    public void enumSourceTest(Fruits fruit){
        System.out.println(fruit);
    }


    //---------------@MethodSource----------------------------------------
    private static String[] fruits(){
        return new String[]{"apple", "banana", "orange", "papaya"};
    }

    @ParameterizedTest(name = "{index} - Run test with args = {0}")
    @MethodSource("fruits")
    public void methodSourceTest(String fruit){
        System.out.println(fruit);
    }

    private static Object[] values(){
        return new Object[][]{
                {"java", "Programming language"},
                {"juint5", "unit testing framework"},
                {"selenium", "automation api"},
                {"github", "repository"}

        };
    }

    @ParameterizedTest(name = "{index} - Run test with args = {0}")
    @MethodSource("values")
    public void methodSourceTest1(String technology, String description){
        System.out.println(technology+" "+description);
    }


    //---------------@CsvSource----------------------------------------

    @ParameterizedTest
    @CsvSource({
            "java, Programming language",
            "junit5, unit testing framework",
            "selenium, automation api",
            "github, repository"
    })
    public void csvSourceTest(String technology, String description){
        System.out.println(technology+"- "+description);
    }


}
