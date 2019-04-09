package com.service.lovlov.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestLovlov {

        LovlovDelegate lovlovDelegate = new LovlovDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = lovlovDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}