package com.hackerpalm.coreconcepts.comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookExampleTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub\
        List<BookExample> list1 = new ArrayList<>();
        list1.add(new BookExample(103, "GoT", "George Martin", 999.0));
        list1.add(new BookExample(102, "Twilight", "XYZ", 550.0));
        list1.add(new BookExample(104, "Mathematics", "Kreyszig", 1299.0));
        list1.add(new BookExample(101, "Physics", "HC Verma", 1399.0));

        /*Sorted through Comparable(java.lang)*/
        System.out.println("Sorted through Comparable(java.lang)");
        Collections.sort(list1);
        list1.forEach((BookExample o)->System.out.println(o));
        System.out.println("---------------------------------------");

        System.out.println("Sorted through Comparator(java.util)");
        System.out.println("Sorting with title via Comparator");
        Comparator<BookExample> cmpById = (b1, b2)->b1.id-b2.id;
        Collections.sort(list1, cmpById);
        list1.forEach((BookExample o)->System.out.println(o));
        System.out.println("---------------------------------------");

        System.out.println("Sorting with title via Comparator");
        Comparator<BookExample> cmpByTitle = (b1,b2)->b2.title.compareTo(b1.title);
        Collections.sort(list1, cmpByTitle);
        list1.forEach((BookExample o)->System.out.println(o));
        System.out.println("---------------------------------------");

        System.out.println("Sorting with Price via Comparator");
        Comparator<BookExample> cmpByPrice = (b1,b2)->b2.price.compareTo(b1.price);
        Collections.sort(list1, cmpByPrice);
        list1.forEach((BookExample o)->System.out.println(o));
        System.out.println("---------------------------------------");


    }
}
