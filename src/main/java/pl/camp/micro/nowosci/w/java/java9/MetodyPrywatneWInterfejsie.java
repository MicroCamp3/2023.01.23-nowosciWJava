package pl.camp.micro.nowosci.w.java.java9;

public interface MetodyPrywatneWInterfejsie {
    void add();

    default int diff(int a, int b) {
        print(a);
        print(b);
        return a - b;
    }

    private void print(int x) {
        System.out.println(x);
    }
}
