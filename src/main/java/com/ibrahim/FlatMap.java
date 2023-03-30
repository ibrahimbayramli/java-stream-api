package com.ibrahim;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> myNestedList=new ArrayList<>();
        myNestedList.add(Arrays.asList("a","b","c"));
        myNestedList.add(Arrays.asList("d","e","f","g"));
        myNestedList.add(Arrays.asList("x","y","z","q"));
        System.out.println(myNestedList);
        System.out.println("----------------------Standart Java----------------------");
        System.out.println(transform(myNestedList));
        System.out.println("------------------------Stream Api------------------------");
        System.out.println(transform2(myNestedList));
    }

    //? iki boyutlu listenin (Nested List, çok boyutlu listeler) bütün elemanlarını tek bir listeye ekleme
    public static List<String> transform(List<List<String>> collection){
        List<String> newCollection=new ArrayList<>();
        for(List<String> subCollection:collection){
            for (String value:subCollection){
                newCollection.add(value);
            }
        }
        return newCollection;
    }

    public static List<String> transform2(List<List<String>> collection){
        return collection.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
