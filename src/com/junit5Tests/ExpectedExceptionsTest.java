package com.junit5Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExpectedExceptionsTest {

        @Test
        public void exceptedExceptionsTest1(){
            Assertions.assertThrows(ArithmeticException.class, ()->divide(1,0));
            System.out.println("Test passed as we handled the exception.");
        }

        @Test
        public void exceptedExceptionsTest2(){
            // This test will not pass because Assertions.assertThrows() excepting ArithmeticException but nothing will throw in this case:
            Assertions.assertThrows(ArithmeticException.class, ()->divide(1,1));
            System.out.println("Test passed as we handled the exception.");
        }


    @Test
    public void exceptedExceptionsTest3(){
        // This test will pass because Assertions.assertThrows() excepting FileNotFoundException it is found in readFile() method:
        Assertions.assertThrows(FileNotFoundException.class, ()->readFile());
        System.out.println("Test passed as we handled the exception.");
    }


    // Super type Exception:
    @Test
    public void exceptedExceptionsTest4(){
        Assertions.assertThrows(IOException.class, ()->readFile());
        System.out.println("Test passed as we handled the exception.");
    }



    private int divide(int a, int b){
        return a/b;
    }

    private void readFile() throws IOException {
         FileInputStream fis = new FileInputStream("./abc.txt");
         fis.read();
         fis.close();
    }
}

