package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

//        Задание №1
        int a = 7;
        int b = 10;
        int result = a + b;
        System.out.println("Задание №1:");
        System.out.println(result);
        System.out.println();

//        Задание №2
        String s1 = "abc";
        String s2 = "def";
        String s3 = "ghi";
        String s4 = "jkl";
        System.out.println("Задание №2, вариант 1:");
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        System.out.println();
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4);
        System.out.println();

        System.out.println("Задание №2, вариант 2:");
        System.out.printf("%s %s %s %s \n", s1, s2, s3, s4);
        System.out.println();
        System.out.printf("%s\n%s\n%s\n%s \n", s1, s2, s3, s4);
        System.out.println();

//        Задание №3
        System.out.println("Задание №3");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 значений: ");
        String first = reader.readLine();
        String second = reader.readLine();
        String third = reader.readLine();
        String fourth = reader.readLine();
        String fifth = reader.readLine();
        String[] listStr = new String[5];
        listStr[0] = first;
        listStr[1] = second;
        listStr[2] = third;
        listStr[3] = fourth;
        listStr[4] = fifth;
        ArrayList<String> newListStr = new ArrayList<String>();
        ArrayList<Integer> strCount = new ArrayList<Integer>();
        for (String s : listStr) {
            if (!newListStr.contains(s)) {
                newListStr.add(s);
            }
        }

        int k = 0;
        for(int i=0;i<newListStr.size();i++) {
            for (int j = i; j < listStr.length; j++) {
                if (newListStr.get(i).equals(listStr[j])) {
                    k++;
                }
            }
            strCount.add(k);
            k=0;
        }

        if (strCount.size() == 5) {
            System.out.println("Все разные");
        } else if (strCount.size() == 1) {
            System.out.println(Arrays.toString(listStr)
                    .replace("[", "")
                    .replace("]", ""));
        } else {
            StringBuilder res = new StringBuilder();
            for (int i=0; i<newListStr.size(); i++) {
                if (strCount.get(i) != 1) {
                    res.append((newListStr.get(i) + " ").repeat(strCount.get(i)));
                }

            }
            System.out.println(res);
        }

//        Задание №4
        System.out.println("Задание №4:");
        System.out.println("Введите количесто баллов от 0 до 100: ");
        int point = Integer.parseInt(reader.readLine());
        if (point >= 0 & point <= 60) {
            System.out.println("Ваша оценка: " + '2');
        } else if (point >= 61 & point <= 74) {
            System.out.println("Ваша оценка: " + '3');
        } else if (point >= 75 & point <= 90) {
            System.out.println("Ваша оценка: " + '4');
        } else if (point >= 91 & point <= 100) {
            System.out.println("Ваша оценка: " + '5');
        } else {
            System.out.println("Некорректное число баллов");
        }
        System.out.println();

//        Задание №5
        System.out.println("Задание №5:");
        System.out.println("Введите количесто баллов от 0 до 100: ");
        int mark = Integer.parseInt(reader.readLine());
        switch ((mark >= 0 & mark <= 60) ? 0 :
                (mark >= 61 & mark <= 74) ? 1 :
                (mark >= 75 & mark <= 90) ? 2 :
                (mark >= 91 & mark <= 100) ? 3 : 4
               )
        {
            case 0:
                System.out.println("Ваша оценка: " + '2');
                break;
            case 1:
                System.out.println("Ваша оценка: " + '3');
                break;
            case 2:
                System.out.println("Ваша оценка: " + '4');
                break;
            case 3:
                System.out.println("Ваша оценка: " + '5');
                break;
            default:
                System.out.println("Некорректное число баллов");
                break;
        }
        System.out.println();

//        Задание №6
        System.out.println("Задание №6:");
        System.out.println("Введите 10 чисел:");
        int[] list = new int[10];
        for(int i = 0; i < 10; i++){
            int s = Integer.parseInt(reader.readLine());
            list[i] = s;
        }
        Arrays.sort(list);
        System.out.println("Отсортированный массив:");
        for (int value : list) {
            System.out.print(value + "  ");
        }
    }
}
