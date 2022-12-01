package com.thealgorithms.maths; 
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;


public class SquareRootWithNewtonRaphsonMethodGenerator extends Generator<Integer[]> {
    public SquareRootWithNewtonRaphsonMethodGenerator(){
        super(Integer[].class); 
    }

    @Override
    public Integer[] generate(SourceOfRandomness random, GenerationStatus __ignore__){
       Integer[] n = new Integer[1]; 
       if (random.nextBoolean()){
         n[0] = null; 
       } else {
         n[0] = random.nextInt(); 
       }
        return n; 
    }

}