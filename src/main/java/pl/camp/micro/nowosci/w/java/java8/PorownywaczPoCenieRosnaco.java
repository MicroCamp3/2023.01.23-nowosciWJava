package pl.camp.micro.nowosci.w.java.java8;

import java.util.Comparator;

public class PorownywaczPoCenieRosnaco implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
