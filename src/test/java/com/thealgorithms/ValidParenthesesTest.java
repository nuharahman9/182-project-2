package com.thealgorithms.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Time;

import static org.junit.Assume.*;

import org.junit.runner.RunWith;
import com.pholser.junit.quickcheck.*;
import com.pholser.junit.quickcheck.generator.*;
import edu.berkeley.cs.jqf.fuzz.*;

@RunWith(JQF.class)
public class ValidParenthesesTest {
	
    @Fuzz
    public void validParenthesesTest(@From(ValidParenthesesGenerator.class) String parens){
        //parens will always be valid to start
        assertTrue(ValidParentheses.isValid(parens));
        int length = parens.length() - 1;
        java.util.Random rand = new java.util.Random();
        int pos = rand.nextInt(0, length);
        String testString = parens.substring(0, pos);
        testString += parens.substring(pos + 1, length);
        assumeTrue(0 < testString.length());
        assertFalse(ValidParentheses.isValid(testString));
    }

    /*
    @Test
    void testOne() {
        assertEquals(true, ValidParentheses.isValid("()"));
    }
  
    @Test
    void testTwo() {
        assertEquals(true, ValidParentheses.isValid("()[]{}"));
    }
  
  
    @Test
    void testThree() {
        assertEquals(false, ValidParentheses.isValid("(]"));
    }
    */
	
}
