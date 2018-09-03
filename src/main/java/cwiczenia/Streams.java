package cwiczenia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

//        numbers.stream().forEach(number-> System.out.println(number));

        List<Integer> list = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .collect(Collectors.toList());


        Integer result = numbers.stream()
                .filter(number -> number > 10)
                .map(number -> number * 10)
                .min(Integer::compareTo)
                .get();



//        110

        List<String> names = Arrays.asList("Janusz", "Anna", "Dobromir", "Sławek", "Marysia", "Pawel", "Bartek");


    }
}
