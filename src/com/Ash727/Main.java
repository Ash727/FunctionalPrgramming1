package com.Ash727;

import java.io.FileOutputStream;
import java.util.*;

public class Main {
    public static void yell (String words){
        Objects.requireNonNull(words,() ->  Main.createdIssue());


        System.out.printf("%s!!!!!!",words );
    }
    public static String createdIssue() {
        return "Issue Created number";
    }

    public  static boolean ifEggs(String i){
                 return true;
    }
    public static void main(String[] args) {
	// write your code here
        String []  someArray = {"a", "g", "b"};
        int []  someArray2 = { 1, 3, 2, 5, 9};
        Arrays.sort(someArray);
        Arrays.sort(someArray2);
        String [] someArray5= Arrays.copyOf(someArray,someArray.length);

        List<String> ingredients = Arrays.asList( "eggs", "flour", "cheese", "bread" );
        List<String> ingredients2 = new ArrayList<>(3);

        if (ingredients.contains("eggs")) {
            System.out.println("It has Eggs");
        }
        ingredients.sort(String::compareTo);
        // see https://docs.oracle.com/javase/8/docs/api/java/util/function/class-use/Consumer.html
        // because the system.out.printinn(string) is a consnumer static method that is implemented we can use it
        // ie methods with parameters
        //  ingredients.sort( (a ,b )-> a.compareTo(b));
        // samme as  ingredients.sort(String::compareTo);
        // as labda like below
        // it takes
      
        ingredients.forEach(System.out::println);
        ingredients.forEach(Main::yell);
        Main.yell(null);

        ingredients.removeIf(ingredient -> {
            return ingredient.contains("eggs");
        });


        // A seqcuence of elements
        // a stream is like a pipeline that allow you to carry values from a source
        // that allow you to express common manpulation on its values declartively
        ingredients.stream().filter(i->ifEggs(i));
    }
}
