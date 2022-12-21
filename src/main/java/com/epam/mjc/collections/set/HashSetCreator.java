package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            int temp = sourceList.get(i);
            if (temp % 2 == 0) {
                while (temp % 2 == 0) {
                    result.add(temp);
                    temp = temp / 2;
                }
            }
            if (temp % 2 != 0) {
                result.add(temp);
                result.add(temp * 2);
            }
        }

        return result;
    }
}
