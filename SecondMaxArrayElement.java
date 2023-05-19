package com.example.VaccinationService.DataStructure_Algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

public class SecondMaxArrayElement {
    public static void main(String[] args) {
       int arr []= {12,35,1,10,34,1};
       // optimized solution
       int max= Integer.MIN_VALUE;
       int second_max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               second_max = max;
               max = arr[i];
           }
           if(arr[i]<max && arr[i]>second_max){
               second_max = arr[i];
           }
       }
        System.out.println(second_max);

       // Using java8 , converting primitive array into non-primitive array first using boxed()
          int res = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
          System.out.println(res);
    }
}
