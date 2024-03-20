package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringProblemsTest {
    @Test
    @DisplayName("Cat return taC")
    public void test1(){
        StringProblems stringProblems = new StringProblems();
        String reversedString = stringProblems.reverse("Cat");
        Assertions.assertEquals(reversedString, "taC");
    }

    @Test
    @DisplayName("CodeJedi return ideJedoC")
    public void test2(){
        StringProblems stringProblems = new StringProblems();
        String reversedString = stringProblems.reverse("CodeJedi");
        Assertions.assertEquals(reversedString, "ideJedoC");
    }

    @Test
    @DisplayName("Hello World return dlroW olleH")
    public void test3(){
        StringProblems stringProblems = new StringProblems();
        String reversedString = stringProblems.reverse("Hello World");
        Assertions.assertEquals(reversedString, "dlroW olleH");
    }

}