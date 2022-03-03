package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
      /**ArrayList тузунуз
       1ден 100го чейинки 50 сан менен толтурунуз
       Дагы 2 ArrayList тузуп бирисине так сандарды, экинчисине жуп сандарды салыныз
       Аларды консольго чыгарыныз
       */
       Random random = new Random();
        ArrayList<Integer> arrayRandomNumList = new ArrayList  <>(); // 50 сан камтыган ArrayList.
        for (int i = 1; i <= 50; i++) {
            arrayRandomNumList.add(random.nextInt(100));
        }
        System.out.println("1ден 100го чейинки 50 сан:\n"+arrayRandomNumList);

        ArrayList<Integer> jupNumList = new ArrayList  <>(); // 50 сандын арасындагы жуп сандарды камтыган ArrayList.
        for (Integer ir: arrayRandomNumList) {
            if (ir % 2 == 0){
                jupNumList.add(ir);
            }
        }
        System.out.println("Жуп сандар: " + jupNumList);

        ArrayList<Integer> takNumList = new ArrayList  <>(); // 50 сандын арасындагы так сандарды камтыган ArrayList.
        for (Integer ir: arrayRandomNumList) {
            if (ir % 2 != 0){
                takNumList.add(ir);
            }
        }System.out.println("Так сандар: " + takNumList);



    }
}
