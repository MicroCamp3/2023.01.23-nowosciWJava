package pl.camp.micro.nowosci.w.java.java8.funkcyjny;

import pl.camp.micro.nowosci.w.java.java8.Car;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> function = x -> "Liczba: " + x;

        String s = function.apply(5);
        System.out.println(s);
        System.out.println(function.apply(10));
        System.out.println(function.apply(2));

        BiFunction<Integer, Double, String> biFunction = (i, d) -> "Wygenerowana liczba : " + (i * d);

        System.out.println(biFunction.apply(4, 6.6));
        System.out.println(biFunction.apply(2, 7.7));

        UnaryOperator<Integer> unaryOperator = i -> i * 10;

        System.out.println(unaryOperator.apply(4));
        System.out.println(unaryOperator.apply(9));

        Predicate<String> predicate = str -> {
            if(str.contains("a")) {
                return true;
            } else if (!str.contains("a") && str.contains("b")) {
                return true;
            } else {
                return false;
            }
        };

        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("bcd"));
        System.out.println(predicate.test("xyz"));

        Supplier<Car> supplier = () -> new Car("newDefaultCar", "newDefaultCar", 0);

        System.out.println(supplier.get());
        System.out.println(supplier.get());

        Car c = supplier.get();
        System.out.println(c);

        Consumer<Car> consumer = System.out::println;

        consumer.accept(c);
        consumer.accept(supplier.get());

        CustomInterface customInterface = () -> System.out.println("Cos tam !!");
        customInterface.a();
    }

    public static Car getDefaultCar() {
        return new Car("newDefaultCar", "newDefaultCar", 0);
    }
}
