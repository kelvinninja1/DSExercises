package src.test.java.io.turntabl.exercises;

// Problem:
// Write a function that combines two lists by alternatingly taking elements, e.g. [a,b,c], [1,2,3] → [a,1,b,2,c,3].

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.main.java.io.turntabl.exercises.AlternatelyCombineTwoLists;
// import org.junit.*;
import DSunit.DS;

public class AlternatelyCombineTwoListsTest {

    public static void main (String arg[]) {

        List<String> firstListExample1 = new ArrayList<String>(),  secondListExample1 = new ArrayList<String>(),  resultExample1 = new ArrayList<String>();
        firstListExample1.addAll(Arrays.asList("a", "b", "c"));
        secondListExample1.addAll(Arrays.asList("1", "2", "3"));
        resultExample1.addAll(Arrays.asList("a", "1", "b", "2", "c", "3"));

        List<String> firstListExample2 = new ArrayList<String>(), secondListExample2 = new ArrayList<String>(), resultExample2 = new ArrayList<String>();
        firstListExample2.addAll(Arrays.asList("T", "U", "R", "N"));
        secondListExample2.addAll(Arrays.asList("T", "A", "B", "L"));
        resultExample2.addAll(Arrays.asList("T", "T", "U", "A", "R", "B", "N", "L"));
        
        DS.assertEquals(AlternatelyCombineTwoLists.combine(firstListExample1, secondListExample1), resultExample1, " Alternatively Combine " + firstListExample1 + " and " + secondListExample1);
        DS.assertEquals(AlternatelyCombineTwoLists.combine(firstListExample2, secondListExample2), resultExample2, " Alternatively Combine " + firstListExample2 + " and " + secondListExample2);
    }

}