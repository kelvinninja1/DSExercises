package src.main.java.io.turntabl.exercises;

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
        int c1 = 0, c2 = 0;
        List<String> resList = new ArrayList<String>();

        while(c1 < firstList.size()) {
            resList.add((String) firstList.get(c1++));
        }

        while(c2 < firstList.size()) {
            resList.add((String) secondList.get(c2++));
        }
        return resList;
    }

}