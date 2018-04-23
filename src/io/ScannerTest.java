package io;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Scanner;

import static java.util.Comparator.comparing;

public class ScannerTest {


    public static void main(String... a) {


        Scanner scanner = new Scanner(System.in);

        int temp = scanner.nextInt();
        System.out.println(temp);

        float flo = scanner.nextFloat();

        System.out.println(flo);
//        List<String> lowCaloricDishesName =
//                menu.stream()
//                        .filter(d -> d.getCalories() < 400).sorted(comparing(Dish::getCalories))
//                        .map(Dish::getName)
//                        .collect(toList());


    }

}
