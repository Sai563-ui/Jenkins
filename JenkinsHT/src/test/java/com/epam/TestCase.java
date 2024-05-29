package com.epam;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {

    @Test(groups = "smoke")
    public void test1(){
        System.out.println("This is test1, group=smoke");
        Assert.assertEquals("test1","test1");
    }

    @Test(groups = "regression")
    public void test2(){
        System.out.println("This is test2, group=regression");
        Assert.assertTrue(true);
    }

    @Test(groups = {"smoke","regression"})
    public void test3(){
        System.out.println("This is test3, group=smoke+regression");
        Assert.assertFalse(false);
    }

}