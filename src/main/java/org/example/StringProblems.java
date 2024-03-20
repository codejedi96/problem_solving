package org.example;

public class StringProblems {
    public String reverse(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
