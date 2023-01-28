package pl.camp.micro.nowosci.w.java.java8.strumienie;

import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
