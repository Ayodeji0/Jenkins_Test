package com.Jenkins_Demo.test;

import com.Jenkins_Demo.Base.BaseClass;
import org.testng.annotations.Test;

public class SimpleTest  extends BaseClass {

    @Test
    public void Test1(){
        System.out.println("This is for jenkins Test1");
    }
    @Test
    public void Test2(){
        System.out.println("This is for jenkins Test2");
    }
    @Test
    public void Test3(){
        System.out.println("This is for jenkins Test3");
    }
}
