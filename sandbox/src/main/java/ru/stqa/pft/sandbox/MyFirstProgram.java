package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Gulnara");

    Square s = new Square(5);
    System.out.println("Plowad' kvadrata so storonoj " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Plowad' pramoygolnika so storonami " + r.a + " i " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
}




    //public static double area(Square s) {
        //return s.l * s.l;
    //}

    //public static double area (Rectangle r) {
        //return r.a * r.b;
    //}



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


