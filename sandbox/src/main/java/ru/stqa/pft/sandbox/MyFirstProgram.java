package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Gulnara");

        double l = 5;
        System.out.println("Plowad' kvadrata so storonoj " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Plowad' pramoygolnika so storonami " + a + " i " + b + " = " + area(a, b));
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double len) {
        return len * len;
    }

    public static double area (double a, double b) {
        return a * b;
    }

}

        //String somebody = "world";
        //System.out.println("Hello, " + somebody + "!");

        //double l = 8.0;
        //double s = l * l;
        //System.out.println("Plow'ad' kvadrata so storonoj " + l + " = " + s);

      //  System.out.println(2 + 2);
      //  System.out.println(2 * 2);
      //  System.out.println(2 / 2);
      //  System.out.println(2 - 2);

      //  System.out.println(1 / 2);
      //  System.out.println(1.0 / 2);
      //  System.out.println(1 / 2.0);
      //  System.out.println(2.0 / 2);

      //  System.out.println("2" + "2");
      //  System.out.println("2" + 2);
      //  System.out.println(2 + "2");

      //  System.out.println(2 + 2 * 2);
      //  System.out.println((2 + 2) * 2);
      //  System.out.println("2 + 2 = " + (2 + 2));


