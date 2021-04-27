package cz.educanet.praha;

import java.util.Scanner;

public class MostAverageNumber {

    static int findMostAverageNumber(Scanner sc) {
       double total = 0;
       int count = 0;
       int average = 0;
       while (sc.hasNext()){
           int c = sc.nextInt();
           total = total + c;
           count++;
           if(count > 0){
               average = (int) total/count;
           }
       }
        return average;
    }
}

