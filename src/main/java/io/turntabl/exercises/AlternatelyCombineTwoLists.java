package src.main.java.io.turntabl.exercises;

// Problem:
// Write a function that combines two lists by alternatingly taking elements, e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3].

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternatelyCombineTwoLists {

    public static void main (String arg[]) {

        List<String> firstList = new ArrayList<String>();
        firstList.addAll(Arrays.asList("a", "b", "c"));

        List<String> secondList = new ArrayList<String>();
        secondList.addAll(Arrays.asList("1", "2", "3"));
        
        System.out.println(combine(firstList, secondList));

        
    }

    public static List<String> combine(List<String> firstList, List<String> secondList) {
        List<String> resList = new ArrayList<String>(firstList.size()+secondList.size());
        int minListSize = (firstList.size() < secondList.size()) ? firstList.size() : secondList.size();

        for (int i = 0; i < minListSize ; i++) {
            resList.add((String) firstList.get(i));
            resList.add((String) secondList.get(i));
        }

        if (firstList.size() > minListSize) {
            for (int firstListCounter = minListSize; firstListCounter < firstList.size(); firstListCounter++) {
                    resList.add((String) firstList.get(firstListCounter));
            }
        } else if (secondList.size() > minListSize) {
            for (int secondListCounter = minListSize; secondListCounter < secondList.size(); secondListCounter++) {
                    resList.add((String) secondList.get(secondListCounter));
            }
        }
        return resList;
    }

}