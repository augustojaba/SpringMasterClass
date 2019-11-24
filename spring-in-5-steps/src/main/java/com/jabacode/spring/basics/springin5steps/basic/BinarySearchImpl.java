package com.jabacode.spring.basics.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    @Qualifier("quick")
    SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {

        // Sorting an array

        //SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        // Bubble Sort Algorithm
        // Quick Sort Algorithm

        // Search the array

        return 3;
    }

    //@PostConstruct
    public void postConstruct() {
        LOGGER.info("Post construct");
    }

    //@PreDestroy
    public void preDestroy() {
        LOGGER.info("Pre destroy");
    }

}
