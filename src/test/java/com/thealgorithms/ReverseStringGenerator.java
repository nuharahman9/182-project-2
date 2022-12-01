package com.thealgorithms.strings;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;


public class ReverseStringGenerator extends Generator<String> {
    public ReverseStringGenerator(){
        super(String.class); 
    }

    @Override 
    public String generate(SourceOfRandomness random, GenerationStatus __ignore__){
        String s = null; 
        char c; 
        int sz = random.nextInt(30); 

        for (int i = 0; i < sz; i++){
            c = (char)(random.nextInt(26) + 'a'); 
            s = s + c; 
        }

        return s; 


    }

}