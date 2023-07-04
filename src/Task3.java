/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
Collections.frequency(list, item)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    static List<String> planetsList = new ArrayList<>();
    public static void main(String[] args) {
        String [] planets = new String[] {"Меркурий","Венера","Земля","Марс","Юпитер","Сатурн","Уран","Нептун"};

        rndPlanets(planets,10);
        System.out.println(planetsList);

        comparisonPlanets(planets);
    }

    static void comparisonPlanets(String[] planets) {
        //Количество повторений
        for (String valPlanets: planets) {
            int count = Collections.frequency(planetsList,valPlanets);
            System.out.println(valPlanets + " повторяется " + count);
        }

    }

    static void rndPlanets(String [] planets, int count) {
        // Заполнение списка случайными планетами
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int value = random.nextInt(0,8);
            planetsList.add(planets[value]);
        }
    }
}
