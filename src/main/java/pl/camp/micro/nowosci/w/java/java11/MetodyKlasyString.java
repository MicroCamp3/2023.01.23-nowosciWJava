package pl.camp.micro.nowosci.w.java.java11;

import java.util.stream.Stream;

public class MetodyKlasyString {
    public static void main(String[] args) {
        String s = "fscgh";

        System.out.println(s.isBlank());

        String string = "A\nB\nC\nD";
        string.lines().forEach(System.out::println);

        String string2 = "cos";
        String repeat = string2.repeat(5);
        System.out.println(repeat);

        String string3 = " ABC ";
        System.out.println(string3.strip());
        System.out.println(string3.stripLeading());
        System.out.println(string3.stripTrailing());
    }
}
