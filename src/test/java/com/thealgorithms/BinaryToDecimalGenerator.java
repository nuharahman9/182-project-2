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
/*   
        String = null

        int sz = random.nextInt(0, 29); 
        if (0 == random.nextInt(0, 1000)) {     //1 in 1000 chance of null
            return n;
        }
        for (int i = 0; i < sz; i++){
            if (random.nextBoolean()){
                n = n + '0'; 
            } else {
                n = n + '1'; 
            }
        }
*/
    if (0 == random.nextInt(0, 1000)) {     //1 in 1000 chance of null
        return null;
    }
        return "" + random.nextInt(0, 1023);    //any larger than 1023 and the binary number won't fit in an int
    }
}
