package com.thealgorithms.conversions;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class BinaryToDecimalGenerator extends Generator<String> {
    public BinaryToDecimalGenerator(){
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
            if (random.nextBoolean()){
                n = n + '0'; 
            } else {
                n = n + '1'; 
            }
        }   

        return n; 
    }
}
