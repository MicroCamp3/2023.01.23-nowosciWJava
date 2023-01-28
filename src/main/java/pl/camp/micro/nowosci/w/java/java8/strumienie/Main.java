package pl.camp.micro.nowosci.w.java.java8.strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,2,3,4,5,6,7,6,8,9);

        List<String> integers = list.stream()
                .filter(i -> i > 2)
                .filter(i -> i < 7)
                .distinct()
                .peek(System.out::println)
                .map(i -> "Liczba: " + i)
                .skip(2)
                .limit(1)
                .toList();
        System.out.println(integers);

        /*Optional<Integer> first = list.stream().noneMatch(i -> i > 0);
        if(first.isPresent()) {
            System.out.println(first.get());
        }*/

        //list.stream().filter(x -> x > 5).forEach(System.out::println);
        //list.stream().filter(x -> x < 7).forEach(System.out::println);

        final int a = 5;
        Predicate<Integer> predicate = x -> {
            int b = 5;
            return x > b;
        };

        System.out.println(predicate.test(3));

        //a = 0;

        System.out.println(predicate.test(3));
    }
}
