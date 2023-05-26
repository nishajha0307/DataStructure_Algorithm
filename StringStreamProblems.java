package com.example.VaccinationService.DataStructure_Algorithm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringStreamProblems {
    public static void main(java.lang.String[] args) {
        java.lang.String str = "tcsinterview";
        // str.chars() convert string of character into IntStream using the ascii value of the character
        long res1 = str.chars().filter(i->i=='a' || i=='e' || i=='i' || i=='o' || i=='u' ).count();
        System.out.println(res1);

        String input = "welcome to code decode and code decode welcome you";
        java.lang.String word = "decode";
        List<java.lang.String> lst1 = Arrays.asList(input.split(" "));
        // printing duplicate words in string
        Set<java.lang.String> set1 = lst1.stream().filter(i->Collections.frequency(lst1,i)>1).collect(Collectors.toSet());
        set1.forEach(System.out::println );

        // iterating hashmap in java
        HashMap<String,String> map = new HashMap<>();
         for(Map.Entry entry : map.entrySet()){
             System.out.println(entry.getKey());
         }

        // find frequency of particular word i.e decode in string
         lst1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                .stream().filter(i->i.getKey().equals(word)).forEach(System.out::println);


        // find out frequency of words in string and store in hashmap


    }
}
