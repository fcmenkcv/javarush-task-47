package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int count = 0;

        while (console.hasNextInt()) {
            int num = console.nextInt();
            count++;
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num > min1 && num < min2) {
                min2 = num;
            }
        }
        if (count >= 2) {
            System.out.println(min2);
        }
    }
}
