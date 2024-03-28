package find_Quadrilateral;

public class PointClass {
  private int xCoord;
  private int yCoord;

  public PointClass(int x, int y) {
    this.xCoord = x;
    this.yCoord = y;
  }

  public int getX() {
    return xCoord;
  }

  public int getY() {
    return yCoord;
  }

  public void setX(int x) {
    this.xCoord = x;
  }

  public void setY(int y) {
    this.yCoord = y;
  }

  public String toString() {
    return "(" + xCoord + ", " + yCoord + ")";
  }

  public double distanceTo(PointClass p) {
    int otherX = p.getX();
    int otherY = p.getY();

    int xDiff = this.xCoord - otherX;
    int yDiff = this.yCoord - otherY;

    int sum = xDiff * xDiff + yDiff * yDiff;

    return Math.sqrt(sum);
  }
}
