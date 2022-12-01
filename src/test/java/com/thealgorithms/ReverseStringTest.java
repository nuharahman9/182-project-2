package com.thealgorithms.strings;
import org.junit.jupiter.api.Test;
import java.lang.*;
import java.io.*;
import java.util.*;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

import com.pholser.junit.quickcheck.*;
import com.pholser.junit.quickcheck.generator.*;
import edu.berkeley.cs.jqf.fuzz.*;

import org.junit.jupiter.api.Assertions;



@RunWith(JQF.class)
public class ReverseStringTest {

    @Fuzz
    public void ReverseStringTest(@From(ReverseStringGenerator.class) String s) {
    //    assumeTrue(s.length() == 12); 
        StringBuilder input1 = new StringBuilder(); 
        input1.append(s); 
        input1.reverse(); 
        String stInput = input1.toString(); 
        Assertions.assertEquals(stInput, ReverseString.reverse(s)); 

    }
}
