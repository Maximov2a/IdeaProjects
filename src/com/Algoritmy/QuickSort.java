
package com.Algoritmy;


import java.util.Arrays;
/*
@startuml

@enduml
 */
public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        //int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3, 545, 1, -656, 0,55 };

        int x[] = new int[40];
        System.out.println("Было");
        for(int i = 0; i < x.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            x[i] = (int)(Math.random() * 10);
            System.out.print(x[i] + "  ");
        }

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println(" ");
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }
}
