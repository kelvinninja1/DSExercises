package src.main.java.io.turntabl.exercises;

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
        int c1 = 0, c2 = 0;
        List<Integer> resList = new ArrayList<Integer>();

        while(c1 < firstList.size() || c2 < firstList.size()) {
           if(c1 < firstList.size()) {
               if (c2 < secondList.size()) {
                   if(firstList.get(c1) <= secondList.get(c2)) {
                        resList.add((Integer) firstList.get(c1++));
                    }
               } else {
                   resList.add((Integer) firstList.get(c1++));
               }
            }

            if(c2 < secondList.size()) {
                if (c1 < firstList.size()) {
                    if(secondList.get(c2) <= firstList.get(c1) ) {
                        resList.add((Integer) secondList.get(c2++));
                    }
                } else {
                    resList.add((Integer) secondList.get(c2++));
                }
            }
        }
        return resList;
    }

}