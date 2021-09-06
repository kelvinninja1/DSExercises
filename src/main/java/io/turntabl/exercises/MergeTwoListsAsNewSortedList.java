package src.main.java.io.turntabl.exercises;

// Problem:
// Write a function that merges two sorted lists into a new sorted list. [1,4,6],[2,3,5] → [1,2,3,4,5,6]. You can do this quicker than concatenating them followed by a sort.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoListsAsNewSortedList {

    public static void main (String arg[]) {

        List<Integer> firstList = new ArrayList<Integer>();
        firstList.addAll(Arrays.asList(1, 4, 6));

        List<Integer> secondList = new ArrayList<Integer>();
        secondList.addAll(Arrays.asList(2, 3, 5));
        
        System.out.println(merge(firstList, secondList));     
    }

    public static List<Integer> merge(List<Integer> firstList, List<Integer> secondList) {
        int firstListCounter = 0, secondListCounter = 0;
        List<Integer> resList = new ArrayList<Integer>();

        while(firstListCounter < firstList.size() || secondListCounter < firstList.size()) {
           if(firstListCounter < firstList.size()) {
               if (secondListCounter < secondList.size()) {
                   if(firstList.get(firstListCounter) <= secondList.get(secondListCounter)) {
                        resList.add((Integer) firstList.get(firstListCounter++));
                    }
               } else {
                   resList.add((Integer) firstList.get(firstListCounter++));
               }
            }

            if(secondListCounter < secondList.size()) {
                if (firstListCounter < firstList.size()) {
                    if(secondList.get(secondListCounter) <= firstList.get(firstListCounter) ) {
                        resList.add((Integer) secondList.get(secondListCounter++));
                    }
                } else {
                    resList.add((Integer) secondList.get(secondListCounter++));
                }
            }
        }
        return resList;
    }

}