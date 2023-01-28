package pl.camp.micro.nowosci.w.java.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MetodyFabrykujaceDoKolekcji {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        System.out.println(list);

        list.add(5);

        System.out.println(list);

        Set<String> set = Set.of("1", "2", "3");
        System.out.println(set);

        Map<Integer, String> map = Map.of(
                1, "V1",
                2, "V2",
                3, "V3");

        System.out.println(map);

        Map<Integer, String> map2 = Map.ofEntries(
                Map.entry(1, "V1"),
                Map.entry(2, "V2"),
                Map.entry(3, "V3")
        );
    }
}
