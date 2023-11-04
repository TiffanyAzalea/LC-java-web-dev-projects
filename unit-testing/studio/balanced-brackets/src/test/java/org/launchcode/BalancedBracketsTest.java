package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        //String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); //,message
    }

    @Test
    public void emptyStringReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }

    @Test
    public void onlyParenthesesReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("()"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void stringWithinTheBracketReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void twoBracketsReturnTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[] []"));
    }

    @Test
    public void bracketsWithinBracketsReturnsTrue () {
        assertTrue (BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void unequalBracketsReturnsFalse () {
        assertFalse (BalancedBrackets.hasBalancedBrackets("[Launch[]"));
    }

    @Test
    public void threeBracketsWithinBracketsReturnsTrue () {
        assertTrue (BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void multipleBracketsWithinBracketsReturnsTrue () {
        assertTrue (BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }
}