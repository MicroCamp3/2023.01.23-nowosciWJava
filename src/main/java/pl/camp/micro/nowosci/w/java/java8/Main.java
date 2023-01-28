package pl.camp.micro.nowosci.w.java.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<String> names = new ArrayList<>();

        names.add("Janusz");
        names.add("Artur");
        names.add("Mateusz");
        names.add("Zbyszek");
        names.add("Bartek");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);*/

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Kia", "Ceed", 200));
        cars.add(new Car("BMW", "3", 300));
        cars.add(new Car("Audi", "A5", 250));
        cars.add(new Car("Toyota", "Corolla", 220));

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        System.out.println(cars);

        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });

        System.out.println(cars);

        Interfejs1 interfejs1 = new Interfejs1() {
            @Override
            public int a() {
                return 0;
            }

            @Override
            public void b() {
                System.out.println("czesc");
            }

            @Override
            public String c(String s) {
                return s + " abc !!!";
            }
        };

        interfejs1.a();
        interfejs1.b();
        interfejs1.c("asdf");

    }
}
