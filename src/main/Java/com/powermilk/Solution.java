package com.powermilk;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] A) {
        int index = 0;

        Set<Integer> visited = new HashSet<>();

        while (index >= 0 && index < A.length) {
            visited.add(index);
            index = index + A[index];
            if (visited.contains(index)) {
                break;
            }
        }

        return A.length - visited.size();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
