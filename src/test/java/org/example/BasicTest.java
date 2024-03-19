package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasicTest {
    @Test
    @DisplayName("10,5 should return true")
    public void test1(){
        Basic basic = new Basic();
        Assertions.assertTrue(basic.compare(10,5));
    }

    @Test
    @DisplayName("10,15 should return false")
    public void test2(){
        Basic basic = new Basic();
        Assertions.assertFalse(basic.compare(10,15));
    }

}