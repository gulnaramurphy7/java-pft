package ru.stqa.pft.sandbox;

/**
 * Created by gmurphy on 3/3/2017.
 */
public class Point {

  public double x;
  public double y;

  public Point(double x, double y1) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point a) {
    return Math.sqrt((a.x - this.x)*(a.x - this.x) + (a.y - this.y) * (a.y - this.y));
  }
}
