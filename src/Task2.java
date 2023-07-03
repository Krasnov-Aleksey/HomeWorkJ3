/*
2 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
Collections.max()
 */

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Integer[] newArr = rnd(5,0,9);
        List<Integer> list = new ArrayList<>(Arrays.asList(newArr));
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        int sum = 0;
        for (Integer number: list) {
            sum+=number;
        }
        System.out.println(sum/list.size());

    }
    static Integer [] rnd (int count, int min, int max) {
        Integer arr[] = new Integer[count];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(min, max);
        }
        return  arr;
    }
}
