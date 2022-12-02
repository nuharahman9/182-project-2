package com.thealgorithms.conversions;

import org.junit.jupiter.api.Test;
import com.pholser.junit.quickcheck.*;
import com.pholser.junit.quickcheck.generator.*;
import edu.berkeley.cs.jqf.fuzz.*;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import edu.berkeley.cs.jqf.fuzz.*;
import java.lang.Math;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JQF.class)
public class BinaryToDecimalTest {

    @Fuzz
    public void BinaryToDecimalTest(@From(BinaryToDecimalGenerator.class) String n) {
        int decimal = Integer.parseInt(n, 2);
        Assertions.assertEquals(decimal, BinaryToDecimal.binaryToDecimal(Integer.parseInt(n))); 
    }
}