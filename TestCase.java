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

    @Test(groups = "regression")
    public void test4(){
        System.out.println("This is test4, group=regression");
        Assert.assertEquals(25,25);
    }

    @Test(groups = "smoke")
    public void test5(){
        System.out.println("This is test5, group=smoke");
        Assert.assertNotEquals("akhilesh","pal");
    }
}
