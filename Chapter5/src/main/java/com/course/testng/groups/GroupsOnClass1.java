package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1() {
        System.out.println("GroupsOnClass111中的stu1111方法!!!");
    }

    public void stu2() {
        System.out.println("GroupsOnClass111中的stu2222方法!!!");
    }
}
