package com.java.advanced.practice;

import java.util.ArrayList;

public class Main {

/*
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.set(58);

        String myString = (String) myBox.get (); // the compiler does not detect it but gives an error at runtime

        GenericBox<Integer> myGenericBox = new GenericBox<>();
        myGenericBox.set(58);
       String myString2 = (String) myGenericBox.get (); // the compiler shows the error before compiling

    }
*/

    public static void main(String[] args) {
        Object myObject = new Object();
        Integer myInteger = 22;
        myObject = myInteger;
        Number myNumber = myInteger;

        ArrayList<Number> myList = new ArrayList<>();
        myList.add(myNumber);
        myList.add(myInteger);

        showList(myList);

        ArrayList<Integer> myOtherList = new ArrayList<>();
        myOtherList.add(myInteger);
        showList2(myOtherList);

    }

    // bounded superiorly: only accept this class or one that extends from it
    // accepts any type of list that extends from class numbers
    private static void showList2(ArrayList<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    // lower bounded: only accept integers, numbers or objects
    private static void showList(ArrayList<? super Number> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }


}

