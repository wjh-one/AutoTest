package com.wjh.extestreport.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    @Test
    public void test1() {
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2() {
        Assert.assertEquals(1,1);
    }

    @Test
    @Parameters({"name", "age"})
    public void test3(String name, int age) {
        Assert.assertEquals("aaa","aaa");
        System.out.println("name = "+ name + ", age = "+ age);
    }

    @Test
    public void logDemo() {
        Reporter.log("自己写的log");
        throw new RuntimeException("自己制造的运行时异常");
    }
}
