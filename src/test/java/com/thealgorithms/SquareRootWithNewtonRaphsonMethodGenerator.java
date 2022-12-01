package com.thealgorithms.maths; 
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;


public class SquareRootWithNewtonRaphsonMethodGenerator extends Generator<Integer> {
    public SquareRootWithNewtonRaphsonMethodGenerator(){
        super(Integer.class); 
    }
    @Override 
    public int generate(SourceOfRandomness random, GenerationStatus __ignore__){
       int n = 0; 
       if (random.nextBoolean()){
        return null; 
       } 

       n = random.nextInt(); 
       return n; 

    }

}