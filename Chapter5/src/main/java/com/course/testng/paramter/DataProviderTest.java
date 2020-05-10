package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "dataProvider")
    public void testDataProvider(String name, int age){
        System.out.println("name = " + name + ", age = "+age);
    }

    @DataProvider(name = "dataProvider")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"张三", 10},
                {"李四", 20},
                {"王五", 30}
        };
        return o;
    }

    @Test(dataProvider = "method")
    public void test1(String name, int age){
        System.out.println("test1 --> name = " + name + ", age = "+age);
    }

    @Test(dataProvider = "method")
    public void test2(String name, int age){
        System.out.println("test2 --> name = " + name + ", age = "+age);
    }

    @DataProvider(name = "method")
    public Object[][] methodData(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"张三", 15},
                    {"李四", 25}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"王五", 55},
                    {"赵六", 65}
            };
        }
        return result;
    }
}
