package com.Algoritmy;

import java.util.Arrays;
import java.util.Collections;

public class StandardMethods {

    public static void main(String[] args) {

        Integer x[] = new Integer[40]; /* при сортировке массива в обратном порядке
        (по убыванию) нужно использовать тип Integer[] вместо примитивного типа int[].*/
        int y[] = new int[40];
        int z[] = new int[40];

        System.out.println("Было");
        for(int i = 0; i < x.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            x[i] = (int)(Math.random() * 100);
            y[i] = (int)(Math.random() * 100);
            z[i] = (int)(Math.random() * 100);
            System.out.print(x[i] + "  ");
        }
                //метода sort() из класса Arrays.
                Arrays.sort(x);

        System.out.println();
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));

        Arrays.sort(x, Collections.reverseOrder());
        System.out.println(Arrays.toString(x));
//==============================================================
        System.out.println();
        System.out.println("Было");
        System.out.println(Arrays.toString(y));
                // вызов метода из  класса bubblesort
                bubblesort.bubblesort(y);
        System.out.println("Стало");
        System.out.println(Arrays.toString(y));
//=============================================================
        System.out.println();
        System.out.println("Было");
        System.out.println(Arrays.toString(z));
                // вызов метода из класса quickSort
                int low = 0;
                int high = z.length - 1;
                QuickSort.quickSort(z, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(z));
    }
}
