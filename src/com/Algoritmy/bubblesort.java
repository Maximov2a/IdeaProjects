package com.Algoritmy;


import java.util.Arrays;

public class bubblesort {

    public static void bubblesort(int[] arr) {
        if (arr.length == 0)
            return;//завершить выполнение если длина массива равна 0

    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }


    public static void main(String[] args) {

        int x[] = new int[20];
        System.out.println("Было");
        for(int i = 0; i < x.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            x[i] = (int)(Math.random() * 100);
            System.out.print(x[i] + "  ");
        }
        //int[] x = {8, 0, 4, 7, 3, 7, 10, 12, -3, 545, 1, -656, 0, 55};
        //System.out.println("Было");
        //System.out.println(Arrays.toString(x));

        bubblesort(x);
        System.out.println(" ");
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
}