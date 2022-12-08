package com.thealgorithms.maths;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import edu.berkeley.cs.jqf.fuzz.*;
import java.lang.Math;
import static org.junit.Assume.*;

import com.pholser.junit.quickcheck.*;
import com.pholser.junit.quickcheck.generator.*;
import edu.berkeley.cs.jqf.fuzz.*;


@RunWith(JQF.class)
public class SquareRootWithNewtonRaphsonMethodTest {

    @Fuzz
    public void SquareRootWithNewtonRaphsonMethodTest(@From(SquareRootWithNewtonRaphsonMethodGenerator.class) String n) {
        int num = Integer.parseInt(n); 
        double res = Math.sqrt(num); 
        assumeTrue(num - SquareRootWithNewtonRaphsonMethod.squareRoot(num) < 0.001); 
         Assertions.assertEquals(num, SquareRootWithNewtonRaphsonMethod.squareRoot(num)); 


    }

    // @Test 
    // public void squareRootZero(){
    //     int num = 0; 
    //     Assertions.assertEquals(0, SquareRootWithNewtonRaphsonMethod.squareRoot(0)); 
    // }

    // @Test 
    // public void squareRootWithNegative(){
    //     int num = -1;
    //     double a = Math.sqrt(-1);  
    //     Assertions.assertEquals(a, SquareRootWithNewtonRaphsonMethod.squareRoot(num)); 
    // }



}
