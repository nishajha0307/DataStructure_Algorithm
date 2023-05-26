package com.example.VaccinationService.DataStructure_Algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class ListStream {

    public static void main(String[] args) {

        // find out duplicates in list
        List<Integer> lst = Arrays.asList(1,2,2,3,4,5);
        Set<Integer> dup = lst.stream().filter(p-> Collections.frequency(lst,p)>1).collect(Collectors.toSet());
        System.out.println(dup);

        // using set
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> set1 = lst.stream().filter(l -> ! duplicates.add(l)).collect(Collectors.toSet());

        // convert list into map
        List<Integer> lst1 = Arrays.asList(1,2,3,4);
        Map<Integer,Integer> map =lst.stream(). collect(Collectors.toMap((v->lst.indexOf(v)),Integer::intValue));
        map.entrySet().stream().forEach(m -> System.out.println(m));



    }
}
