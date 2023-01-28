package pl.camp.micro.nowosci.w.java.java8.strumienie;

import java.util.function.Predicate;

public class MojPredykat implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        int b = 5;
        return integer > b;
    }
}
