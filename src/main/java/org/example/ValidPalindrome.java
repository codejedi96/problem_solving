package org.example;

/*
 Given a string, return whether it forms a palindrome ignoring case
 and non-alphabetical characters.
 Note: a palindrome is a sequence of characters that reads the
 same forwards and backwards.
 Ex:
 "level", return true
 "algorithm", return false
 "A man, a plan, a canal: Panama.", return true
*/
public class ValidPalindrome {
    public boolean check(String input) {
        if (input.isEmpty() || input.length() == 1) {
            return true;
        }
        input = input.toLowerCase();
        input = input.replaceAll("[^a-z]", "");
        StringProblems stringProblems = new StringProblems();
        return input.equals(stringProblems.reverse(input));
    }
}
