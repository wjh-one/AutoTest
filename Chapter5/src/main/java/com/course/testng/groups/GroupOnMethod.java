package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端的测试 1111111111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端的测试 2222222222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端的测试 11111111111");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端的测试 22222222222");
    }

    @BeforeGroups("client")
    public void beforeOnGroup(){
        System.out.println("客户端分组之前运行!!!");
    }

    @AfterGroups("client")
    public void afterOnGroup(){
        System.out.println("客户端分组之后运行!!!");
    }
}
