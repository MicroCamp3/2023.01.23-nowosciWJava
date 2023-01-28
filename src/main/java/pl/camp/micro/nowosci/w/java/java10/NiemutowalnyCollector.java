package pl.camp.micro.nowosci.w.java.java10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NiemutowalnyCollector {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);

        List<String> newList = list.stream()
                .map(i -> i + "_STRING")
                .collect(Collectors.toUnmodifiableList());
        newList.add("23hdjksf");
        System.out.println(newList);
    }
}
