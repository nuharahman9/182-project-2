package com.thealgorithms.strings;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class ValidParenthesesGenerator extends Generator<String> {
    public ValidParenthesesGenerator(){
        super(String.class); 
    }

    @Override 
    public String generate(SourceOfRandomness random, GenerationStatus __ignore__){
        int MAXSIZE = 100;
        int size = random.nextInt(2, MAXSIZE);
        String bal = "";
        String enced = "";
        //Generates Valid parentheses
        size = size / 2;
        for(int i = 0; i < size; i++){      //Creates a random array of open parens
            switch(random.nextInt(0, 3)){
                case 0:
                    bal += '{';
                    enced = '}' + enced;
                    break;
                case 1:
                    bal += '(';
                    enced = ')' + enced;
                    break;
                case 2:
                    bal += '[';
                    enced = ']' + enced;
                    break;
                default:
                    bal += '{';
                    enced = '}' + enced;
            }
        }
        return bal + enced;
    }
}
