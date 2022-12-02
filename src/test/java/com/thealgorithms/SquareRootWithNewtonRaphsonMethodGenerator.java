package com.thealgorithms.maths; 
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;


public class SquareRootWithNewtonRaphsonMethodGenerator extends Generator<String> {
    public SquareRootWithNewtonRaphsonMethodGenerator(){
        super(String.class); 
    }

    @Override
    public String generate(SourceOfRandomness random, GenerationStatus __ignore__){
        return "" + random.nextInt(0, 1023);
    }

}