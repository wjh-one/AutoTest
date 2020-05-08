package com.course.testng;

import org.testng.annotations.Test;

/**
 * 异常测试
 * 什么时候用到异常测试
 * 在期望结果就是某一个异常的时候.
 * 预期结果就是这个异常!
 */
public class ExpectedException {
    //测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这个方法期望出现RuntimeException, 但是没出现, 所以测试结果为失败!");
    }

    //测试结果会成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这个方法期望出现RuntimeException, 在下方new了一个, 所以测试结果为成功!");
        throw new RuntimeException();
    }
}
