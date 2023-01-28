package pl.camp.micro.nowosci.w.java.java8.strumienie;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,7,5,6,7,8,3,5,9,10,11,12);

        Set<Integer> distinctSet = new HashSet<>();
        int limit = 0;
        for(int i : list) {
            if(i > 3 && i < 10 && !distinctSet.contains(i) && limit < 2) {
                distinctSet.add(i);
                limit++;
                System.out.println("Liczba: " + i);
            }
        }

        list.stream()
                .filter(i -> i > 3)
                .filter(i -> i < 10)
                .distinct()
                .limit(2)
                .map(x -> "Liczba: " + x)
                .forEach(System.out::println);
    }
}
