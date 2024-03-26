package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ValidPalindromeTest {

    @Test
    @DisplayName("level, return true")
    public void test1(){
        ValidPalindrome validPalindrome = new ValidPalindrome();
        Assertions.assertTrue(validPalindrome.check("level"));
    }

    @Test
    @DisplayName("algorithm, return false")
    public void test2(){
        ValidPalindrome validPalindrome = new ValidPalindrome();
        Assertions.assertFalse(validPalindrome.check("algorithm"));
    }

    @Test
    @DisplayName("A man, a plan, a canal: Panama., return true")
    public void test3(){
        ValidPalindrome validPalindrome = new ValidPalindrome();
        Assertions.assertTrue(validPalindrome.check("A man, a plan, a canal: Panama."));
    }

}