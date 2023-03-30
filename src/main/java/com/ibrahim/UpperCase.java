package com.ibrahim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;


public class UpperCase {
    public static void main(String[] args) {


//        System.out.println(mapToUppercase("A","b","c","d"));
        System.out.println(mapToUppercase2("A","b","c","d"));

    }

    //? bir liste parametresi al, bunları for döngüsüyle tamamını büyük harfe çevir ve return et.
    public static Collection<String> mapToUppercase(String... names){
        Collection<String> upperCaseNames=new ArrayList<>();
        for (String name:names){
            upperCaseNames.add(name.toUpperCase());
        }
        return upperCaseNames;
    }


    public static Collection<String> mapToUppercase2(String... names){

        return Arrays.asList(names).stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
