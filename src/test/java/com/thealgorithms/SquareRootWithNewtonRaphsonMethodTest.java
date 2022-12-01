package com.thealgorithms.maths;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import edu.berkeley.cs.jqf.fuzz.*;
import java.lang.Math;

import com.pholser.junit.quickcheck.*;
import com.pholser.junit.quickcheck.generator.*;
import edu.berkeley.cs.jqf.fuzz.*;


@RunWith(JQF.class)
public class SquareRootWithNewtonRaphsonMethodTest {

    @Fuzz
    void SquareRootWithNewtonRaphsonMethodTest(@From(SquareRootWithNewtonRaphsonMethodGenerator.class) Integer n) {
        int a = Math.sqrt(n); 
        Assertions.assertEquals(
            a,
            SquareRootWithNewtonRaphsonMethod.squareRoot(n)
        );
    }


}
