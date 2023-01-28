package pl.camp.micro.nowosci.w.java.java8.strumienie;

import java.util.*;
import java.util.function.Supplier;

public class Zadanie2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("asdffasdf");
        list.add("asdffasdf");
        list.add("asDFGfasdf");
        list.add("asdSDFGasdf");
        list.add("asdf fasdf");
        list.add("asdf faASDFGf");
        list.add("asdf fas df");
        list.add("asdffas");
        list.add("asdf.fas");
        list.add("asdds.ff.as");
        list.add("asdsdf.fas dfsglkj SADfg");
        list.add("asddsfffas.sdfg asdfgtdsa");
        list.add("asdfsdffas,sdfg asdf.tdsa");
        list.add("asdfsdfas,sdfg asdf tdsa");
        list.add("asdffsdfas,sdfg asASDfgtdsa");
        list.add("asdfdsfas,sdfgasdfgtdsa");
        list.add("asdffsdfas,sdfgsdfa.sdfgtdsasdfga");
        list.add("asdggffas,sdfgfgga.sgggdfgt.dssdfga");

        list.stream()
                .filter(s -> !s.contains(" "))
                .filter(s -> s.toLowerCase().equals(s))
                .map(s -> s.replaceAll("\\.", ""))
                .map(s -> s.replaceAll(",", ""))
                .mapToInt(String::length)
                .average()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("Brak stringow !!"));

        Supplier<String> defaultStringSupplier = () -> "Domyslny string";
        Optional<String> stringBox = Optional.empty();
        System.out.println(stringBox.orElseThrow(BrakWartosciException::new));
    }
}
