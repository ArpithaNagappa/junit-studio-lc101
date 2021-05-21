package test;

import org.junit.Test;
import main.*;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsBeginEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsBetweenEndReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsBeginReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void bracketsNoneReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsBeginReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketsWrongOrderBetweenReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void bracketsWrongOrderReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsOnlyBeginReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void bracketsOnlyEndReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void bracketBeginOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode"));
    }

    @Test
    public void bracketEndOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode["));
    }

}
