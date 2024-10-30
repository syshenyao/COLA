package com.alibaba.cola.test;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Slf4j
public class Demo {

    @BeforeEach
    public void before(){
        System.out.println("before action");
    }

    @Test
    public void testOne(){
        System.out.println("test one");
        Assertions.assertEquals(1,1);
        System.out.println("test one end");
    }
    

    @AfterEach
    public void after(){
        System.out.println("after action");
    }
}
