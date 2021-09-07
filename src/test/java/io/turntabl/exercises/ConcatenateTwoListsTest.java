package src.test.java.io.turntabl.exercises;

// Problems:
// Write a function that concatenates two lists. [a,b,c], [1,2,3] → [a,b,c,1,2,3]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.main.java.io.turntabl.exercises.ConcatenateTwoLists;
// import org.junit.*;
import DSunit.DS;

public class ConcatenateTwoListsTest {

    public static void main (String arg[]) {

        List<String> firstListExample1 = new ArrayList<String>(),  secondListExample1 = new ArrayList<String>(),  resultExample1 = new ArrayList<String>();
        firstListExample1.addAll(Arrays.asList("a", "b", "c"));
        secondListExample1.addAll(Arrays.asList("1", "2", "3"));
        resultExample1.addAll(Arrays.asList("a", "b", "c", "1", "2", "3"));

        List<String> firstListExample2 = new ArrayList<String>(), secondListExample2 = new ArrayList<String>(), resultExample2 = new ArrayList<String>();
        firstListExample2.addAll(Arrays.asList("T", "U", "R", "N"));
        secondListExample2.addAll(Arrays.asList("T", "A", "B", "L"));
        resultExample2.addAll(Arrays.asList("T", "U", "R", "N", "T", "A", "B", "L"));

        List<String> firstListExample3 = new ArrayList<String>(), secondListExample3 = new ArrayList<String>(), resultExample3 = new ArrayList<String>();
        firstListExample3.addAll(Arrays.asList("T", "U", "R", "N"));
        secondListExample3.addAll(Arrays.asList("T", "A", "B", "L", "E"));
        resultExample3.addAll(Arrays.asList("T", "U", "R", "N", "T", "A", "B", "L", "E"));
        
        DS.assertEquals(ConcatenateTwoLists.concatenate(firstListExample1, secondListExample1), resultExample1, " Concatenating " + firstListExample1 + " and " + secondListExample1);    
        DS.assertEquals(ConcatenateTwoLists.concatenate(firstListExample2, secondListExample2), resultExample2, " Concatenating " + firstListExample2 + " and " + secondListExample2);
        DS.assertEquals(ConcatenateTwoLists.concatenate(firstListExample3, secondListExample3), resultExample3, " Concatenating " + firstListExample3 + " and " + secondListExample3);
        
    }
}