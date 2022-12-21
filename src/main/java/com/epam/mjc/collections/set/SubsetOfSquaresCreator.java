package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> setResult = new TreeSet<>();
        for (Integer i :
                sourceList) {
            setResult.add(i * i);
        }

        SortedSet<Integer> newRes = ((TreeSet<Integer>) setResult).subSet(lowerBound, true,upperBound, true);


        return newRes;
    }

}
