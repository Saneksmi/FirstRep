package com.company.MegaSort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> yourList = new ArrayList<>();

        System.out.println("Введите несколько произвольных чисел через Enter:");
        while (true){
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            yourList.add(Integer.parseInt(s));
        }

        System.out.println("Ваш массив:");
        for (Integer x: yourList
             ) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Выберите метод сортировки:");
        System.out.println("  1. Selection sort");
        System.out.println("  2. Gnome sort");
        System.out.println("  3. Coctail sort");
        System.out.println();

        int sortMethod = Integer.parseInt(reader.readLine());
        switch (sortMethod) {
            case 1: MySort.selectionSort(yourList);
                break;
            case 2: MySort.gnomeSort(yourList);
                break;
            case 3: MySort.coctailSort(yourList);
                break;
            default: System.out.println("не будем сортировать :Р");
        }


    }


}
