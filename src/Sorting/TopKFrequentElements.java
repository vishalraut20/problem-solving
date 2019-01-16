package Sorting;

import java.util.*;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> frequentNumbers = new LinkedList<>();
        Map<Integer, Integer> numsCountMap = new HashMap<>();
        for(int num: nums){
            if(numsCountMap.containsKey(num)){
                numsCountMap.put(num, numsCountMap.get(num) + 1);
            } else {
                numsCountMap.put(num, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> elementList =  new LinkedList<>(numsCountMap.entrySet());

        elementList.sort((Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) -> o2.getValue() - o1.getValue());
        int i = 0;
        int listSize = elementList.size();
        while(i < k && i < listSize) {
            ((LinkedList<Integer>) frequentNumbers).addLast(((LinkedList<Map.Entry<Integer, Integer>>) elementList).remove().getKey());
            i++;
        }
        return frequentNumbers;
    }
}
