import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
1 . Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class Task1 {
    public static void main(String[] args) {
        Integer [] newArr = rnd(20,0, 10);
        System.out.println(Arrays.toString(newArr));

        List<Integer> list = new ArrayList<>(Arrays.asList(newArr));
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
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
