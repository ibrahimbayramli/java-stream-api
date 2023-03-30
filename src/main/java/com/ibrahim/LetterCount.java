package com.ibrahim;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {

        //! 6("asdfgf") + 8("12345678")
        System.out.println(getNumberOfNamesLongerThanFive("asdfgf","asd","a","12345678"));
    }

    //? Array elemanları al 5 den büyük olanların harf sayılarının toplamını geri gönder
    public static int getNumberOfNamesLongerThanFive(String... names){
        return Arrays.stream(names)
                .filter(name->name.length()>5)
                .mapToInt(String::length).sum();
    }
}
