package pl.camp.micro.nowosci.w.java.java8.funkcyjny;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(getDataFromDBAndUseAlg1());

        System.out.println(getAndCalculate(Main2::getDataFromDB, Main2::calculateAlg1));
        System.out.println(getAndCalculate(Main2::getDataFromDB, Main2::calculateAlg2));
        System.out.println(getAndCalculate(Main2::getDataFromDB, Main2::calculateAlg4));
        System.out.println(getAndCalculate(Main2::getDataFromFile, Main2::calculateAlg3));
        System.out.println(getAndCalculate(Main2::getDataFromFile, Main2::calculateAlg1));
        System.out.println(getAndCalculate(Main2::getDataFromFile, Main2::calculateAlg2));

    }

    public static int calculateAlg1(int data) {
        return data * 1;
    }

    public static int calculateAlg2(int data) {
        return data * 2;
    }

    public static int calculateAlg3(int data) {
        return data * 3;
    }

    public static int calculateAlg4(int data) {
        return data * 4;
    }

    public static int getDataFromDB() {
        return 1;
    }

    public static int getDataFromFile() {
        return 2;
    }

    public static int getDataFromDBAndUseAlg1() {
        int data = getDataFromDB();
        int result = calculateAlg1(data);
        return result;
    }

    public static int getDataFromFileAndUserAlg1() {
        int data = getDataFromFile();
        int result = calculateAlg1(data);
        return result;
    }

    public static int getAndCalculate(Supplier<Integer> dataReader,
                                      UnaryOperator<Integer> calcFunction) {
        int data = dataReader.get();
        int result = calcFunction.apply(data);
        return result;
    }
}
