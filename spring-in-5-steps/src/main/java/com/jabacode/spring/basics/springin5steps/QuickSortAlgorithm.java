package com.jabacode.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class QuickSortAlgorithm implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        // Logic for Quick Sort

        return numbers;
    }
}
