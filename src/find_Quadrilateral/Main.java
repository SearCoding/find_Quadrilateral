package find_Quadrilateral;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    findQuadrilateral();
  }

  public static void findQuadrilateral() {
    int x = 0;
    int y = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Type in a coordinate");

    x = sc.nextInt();
    y = sc.nextInt();

    PointClass p1 = new PointClass(x, y);

    System.out.println("Type in a coordinate");

    x = sc.nextInt();
    y = sc.nextInt();

    PointClass p2 = new PointClass(x, y);

    System.out.println("Type in a coordinate");

    x = sc.nextInt();
    y = sc.nextInt();

    PointClass p3 = new PointClass(x, y);

    System.out.println("Type in a coordinate");

    x = sc.nextInt();
    y = sc.nextInt();

    PointClass p4 = new PointClass(x, y);

    sc.close();

    Quadrilateral q = new Quadrilateral(p1, p2, p3, p4);

    if (q.isRectangle() == true) {
      System.out.println("This is a rectangle");
    } else {
      System.out.println("This is not a rectangle");
    }

    if (q.isSquare() == true) {
      System.out.println("This is a square");
    } else {
      System.out.println("This is not a square");
    }
  }
}
