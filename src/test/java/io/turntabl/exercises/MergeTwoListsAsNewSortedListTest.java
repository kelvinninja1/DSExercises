package src.test.java.io.turntabl.exercises;

// Problem:
// Write a function that merges two sorted lists into a new sorted list. [1,4,6],[2,3,5] → [1,2,3,4,5,6]. You can do this quicker than concatenating them followed by a sort.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.main.java.io.turntabl.exercises.MergeTwoListsAsNewSortedList;
// import org.junit.*;
import DSunit.DS;

public class MergeTwoListsAsNewSortedListTest {

    public static void main (String arg[]) {

        List<Integer> firstListExample1 = new ArrayList<Integer>(),  secondListExample1 = new ArrayList<Integer>(),  resultExample1 = new ArrayList<Integer>();
        firstListExample1.addAll(Arrays.asList(1, 4, 6));
        secondListExample1.addAll(Arrays.asList(2, 3, 5));
        resultExample1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> firstListExample2 = new ArrayList<Integer>(), secondListExample2 = new ArrayList<Integer>(), resultExample2 = new ArrayList<Integer>();
        firstListExample2.addAll(Arrays.asList(0, 2, 4, 6, 8, 10));
        secondListExample2.addAll(Arrays.asList(1, 3, 5, 7, 9, 11));
        resultExample2.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13));
        
        DS.assertEquals(MergeTwoListsAsNewSortedList.merge(firstListExample1, secondListExample1), resultExample1, " Alternatively Combine " + firstListExample1 + " and " + secondListExample1);
        DS.assertEquals(MergeTwoListsAsNewSortedList.merge(firstListExample2, secondListExample2), resultExample2, " Alternatively Combine " + firstListExample2 + " and " + secondListExample2);  
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