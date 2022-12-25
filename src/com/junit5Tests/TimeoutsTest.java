package com.junit5Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeoutsTest {

    @Test
    @Timeout(6)
    public void timeoutTest() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Test passed within the time!");
    }


    @Test
    @Timeout(6)
    public void timeoutTest1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        System.out.println("Test passed within the time!");
    }

    @Test
    public void timeoutTest2(){
        Assertions.assertTimeout(Duration.ofSeconds(6), ()-> delaySeconds(5));
    }

    private void delaySeconds(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }
}
