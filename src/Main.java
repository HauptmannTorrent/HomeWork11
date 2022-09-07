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

    // Задание 4.

    byte excessWeight = 7;
    short lW1 = 250;
    short lW2 = 500;
    short grammPerKg = 1000;
    short excessWeightPerGramm = (short) (excessWeight * grammPerKg);
    short time1 = (short) (excessWeightPerGramm / lW1);
    short time2 = (short) (excessWeightPerGramm / lW2);
    System.out.println("Если спортсмен теряет 250 грамм каждый день то ему нужно "+ time1+ " дней.");
    System.out.println("Если спортсмен теряет 500 грамм каждый день то ему нужно "+ time2+ " дней.");

    // Задание 5.

    double mSalary = 67760;
    short mSalaryA = (short) (mSalary / 100 * 10);
    int mSalaryPerYear = (int) (mSalary * 12);
    int mSalaryAPerMonth = (int) (mSalary + mSalaryA);
    int mSalaryAPerYear = mSalaryAPerMonth * 12;
    int mSalDif = mSalaryAPerYear - mSalaryPerYear;

    double dSalary = 83690;
    short dSalaryA = (short) (dSalary / 100 * 10);
    int dSalaryPerYear = (int) (dSalary * 12);
    int dSalaryAPerMonth = (int) (dSalary + dSalaryA);
    int dSalaryAPerYear = dSalaryAPerMonth * 12;
    int dSalDif = dSalaryAPerYear - dSalaryPerYear;

    double kSalary = 76230;
    short kSalaryA = (short) (kSalary / 100 * 10);
    int kSalaryPerYear = (int) (kSalary * 12);
    int kSalaryAPerMonth = (int) (kSalary + kSalaryA);
    int kSalaryAPerYear = kSalaryAPerMonth * 12;
    int kSalDif = kSalaryAPerYear - kSalaryPerYear;

    System.out.println("Маша теперь получает " + mSalaryAPerMonth + " рублей. Годовой доход вырос на " + mSalDif + " рублей.");
    System.out.println("Денис теперь получает " + dSalaryAPerMonth + " рублей. Годовой доход вырос на " + dSalDif + " рублей.");
    System.out.println("Кристина теперь получает " + kSalaryAPerMonth + " рублей. Годовой доход вырос на " + kSalDif + " рублей.");
    }
}