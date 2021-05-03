package cz.educanet.praha;

import java.util.Scanner;

public class MostAverageNumber {

    static int findMostAverageNumber(Scanner sc) {
       int total = 1;
       int count = 1;
       int average = 0;
       while (sc.hasNext()){
           int c = sc.nextInt();
           total = total + c;
           count++;
           if(count > 0){
               average = total /count;
           }
       }
        return average;
    }
}

