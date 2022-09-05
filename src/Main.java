import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

    // Задание 1.

    // Типы переменных:
    // Целочисленные
    byte a = 121;
    short b = 30000;
    int c = 2139999999;
    long d = 500000000000L;
    // С плавающей точкой
    double e = 3.5;
    float f = 7.5f;
    // Символы
    char g = 35;
    // Логические
    boolean h = a > 110;

    // Задание 2.

    double boxer1 = 78.2;
    double boxer2 = 82.7;
    double weightOfAllBoxer = boxer1 + boxer2;
    double weightDifference = boxer2 - boxer1;
    System.out.println("Общий вес боксёров " + weightOfAllBoxer);
    System.out.println("Разница в весе боксёров " + weightDifference);

    // Задание 3.

    byte bananas = 5;
    short bananasWeight = (short) (bananas * 80);
    short milk = 2;
    short milkWeight = (short) (milk * 105);
    short iceCream = 2;
    short iceCreamWeight = (short) (iceCream * 100);
    byte eggs = 4;
    short eggsWeight = (short) (eggs * 70);
    double fullWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
    short grPerKg = 1000;
    double fullWeightInKIlo = fullWeight / grPerKg;
    System.out.println("Вес завтрака в килограммах = " + fullWeightInKIlo);

    // Задание 4
    byte excessWeight = 7;

    }
}