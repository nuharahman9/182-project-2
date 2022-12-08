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
        int sz = random.nextInt(0, 30); 
        if (sz == 0){
            if (random.nextBoolean()){
                return ""; 
            } else {
                return s; 
            }
        }
        else {
            s = ""; 
            for (int i = 0; i < sz; i++){
                 s = s + (char)random.nextInt(127); 
            }

            return s; 

            
        }



    }

}