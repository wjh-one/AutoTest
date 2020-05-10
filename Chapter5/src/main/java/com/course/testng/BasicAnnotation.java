package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
        System.out.printf("thread id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
        System.out.printf("thread id : %s%n",Thread.currentThread().getId());
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod,测试方法执行之前执行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod,测试方法执行之后执行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass,测试类执行之前执行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass,测试类执行之后执行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite,测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite,测试套件");
    }
}
