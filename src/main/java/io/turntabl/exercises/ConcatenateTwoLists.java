package src.main.java.io.turntabl.exercises;

// Problems:
// Write a function that concatenates two lists. [a,b,c], [1,2,3] → [a,b,c,1,2,3]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatenateTwoLists {

    public static void main (String arg[]) {

        List<String> firstList = new ArrayList<String>();
        firstList.addAll(Arrays.asList("a", "b", "c"));

        List<String> secondList = new ArrayList<String>();
        secondList.addAll(Arrays.asList("1", "2", "3"));
        
        System.out.println(concatenate(firstList, secondList)); 

    }

    public static List<String> concatenate(List<String> firstList, List<String> secondList) {
        
        List<String> resList = new ArrayList<String>();

        for (int firstListCounter = 0; firstListCounter < firstList.size();) {
            resList.add((String) firstList.get(firstListCounter++));
        }
        for (int secondListCounter = 0; secondListCounter < secondList.size();) {
            resList.add((String) secondList.get(secondListCounter++));
        }
        return resList;
    }

}