package com.thealgorithms.strings;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class UpperGenerator extends Generator<String> {
    public UpperGenerator(){
        super(String.class); 
    }

    @Override 
    public String generate(SourceOfRandomness random, GenerationStatus __ignore__){
        String n = null; 
        int sz = random.nextInt(60); 
        if (random.nextBoolean()) {
            return n; 
        }
        for (int i = 0; i < sz; i++){
           n = n + (char)random.nextInt(127); 
        }   

        return n; 
    }
}
