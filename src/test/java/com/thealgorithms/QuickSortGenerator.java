package com.thealgorithms.sorts;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class QuickSortGenerator extends Generator<Integer[]> {
    public QuickSortGenerator(){
        super(Integer[].class); 
    }

    @Override 
    public Integer[] generate(SourceOfRandomness random, GenerationStatus __ignore__){
        int MAXSIZE = 100;
        int size = random.nextInt(1, MAXSIZE);
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt();
        }
        return arr;
    }
}
