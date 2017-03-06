package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by gmurphy on 3/5/2017.
 */
public class PointTests {

  @Test
  public void testDistance() {
    Point a = new Point(6, 3);
    Point b = new Point (5, 4);
    Assert.assertEquals(a.distance(b), 1.0);
  }
}
