package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    @Test(invocationCount = 8, threadPoolSize = 2)
    public void test() {
        System.out.println(1);
        System.out.printf("thread id : %s%n",Thread.currentThread().getId());
    }
}
