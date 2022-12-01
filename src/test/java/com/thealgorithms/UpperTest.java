package com.thealgorithms.strings; 
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
public class UpperTest {

    @Fuzz
    public void UpperTest(@From(UpperGenerator.class) String n){
        String res = n.toUpperCase(); 
        Assertions.assertEquals(res, Upper.toUpper(n)); 
    }

}